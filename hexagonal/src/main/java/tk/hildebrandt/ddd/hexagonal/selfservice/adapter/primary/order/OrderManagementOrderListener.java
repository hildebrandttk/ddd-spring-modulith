package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.primary.order;

import lombok.RequiredArgsConstructor;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary.OrderCreatedUseCase;

@RequiredArgsConstructor
public class OrderManagementOrderListener {
   private OrderCreatedUseCase orderCreatedUseCase;
   private OrderManagementOrderConverter orderManagementOrderConverter;

   public void onMessage(OrderDto orderDto) {
      orderCreatedUseCase.createOrder(orderManagementOrderConverter.toDomain(orderDto));
   }
}
