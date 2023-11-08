package tk.hildebrandt.ddd.modulith.selfservice.returns;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import tk.hildebrandt.ddd.modulith.selfservice.orders.Order;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
class ReturnOrderUseCase {
    // Geht hier jetzt nicht mehr
    // TODO package local repo is not accessible
    //  private Orders orders;
    private OrderService orderService;
    private Returns returns;
    private ApplicationEventPublisher eventPublisher;

    public ReturnOrderResult returnOrder(OrderId orderId, List<ReturnItem> returnItems) {
        Return aReturn = Return.builder()
                .forOrder(orderId)
                .returnItems(returnItems)
                .build();
        Optional<Order> order = orderService.findOrder(orderId);
        List<ReturnOrderError> returnOrderErrors = order.map(aReturn::isValidForOrder)
                .orElseThrow(OrderNotPresentException::new);
        ReturnOrderResult.ReturnOrderResultBuilder resultBuilder = ReturnOrderResult.builder();
        if (returnOrderErrors.isEmpty()) {
            aReturn = returns.save(aReturn);
            resultBuilder.aReturn(aReturn);
        } else {
            resultBuilder.returnOrderErrors(returnOrderErrors);
        }
        //TODO notify other services
//      shippingService.createRetoureLabelAndSendToCustomer();
//      accountService.addReturnForAccountRating();
//      ...
        eventPublisher.publishEvent(new ReturnCreatedEvent(this, orderId, order.get().getForAccount(), aReturn.getId()));
        return resultBuilder.build();
    }

    //TODO Shipment async kafka sender incl. transactional resend.
}
