package tk.hildebrandt.ddd.modulith.selfservice.returns;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.modulith.test.Scenario;
import tk.hildebrandt.ddd.modulith.selfservice.orders.Order;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderService;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ApplicationModuleTest
class ReturnOrderUseCaseTest {
    @MockBean
    private OrderService orderService;

    @Autowired
    private ReturnOrderUseCase returnOrderUseCase;

    @Test
    void testReturnItems() {
        //GIVEN
        OrderId testOrderId = OrderId.orderId();
        OrderItemId orderItemId = OrderItemId.orderItemId();
        when(orderService.findOrder(testOrderId))
                .thenReturn(Optional.of(Order.builder()
                        .id(testOrderId)
                        .build()));
        //WHEN

        ReturnOrderResult returnOrderResult = returnOrderUseCase
                .returnOrder(testOrderId,
                        List.of(ReturnItem.builder()
                                .affectedOrderItem(orderItemId)
                                .build()));

        //THEN
        assertThat(returnOrderResult.getAReturn()).isNotNull();
        assertThat(returnOrderResult.getAReturn()
                .getReturnItems()).hasSize(1)
                .allMatch(returnItem -> orderItemId.equals(returnItem.getAffectedOrderItem()));
    }

    @Test
    void testReturnEvent(Scenario scenario) {
        //GIVEN
        OrderId testOrderId = OrderId.orderId();
        OrderItemId orderItemId = OrderItemId.orderItemId();
        when(orderService.findOrder(testOrderId))
                .thenReturn(Optional.of(Order.builder()
                        .id(testOrderId)
                        .build()));

        //WHEN
        scenario.stimulate(() -> returnOrderUseCase
                        .returnOrder(testOrderId,
                                List.of(ReturnItem.builder()
                                        .affectedOrderItem(orderItemId)
                                        .build())))
        //THEN
                .andWaitForEventOfType(ReturnCreatedEvent.class)
                .matching(event -> orderItemId.equals(event.getReturnId()));
    }
}