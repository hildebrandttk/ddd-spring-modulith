package tk.hildebrandt.ddd.modulith.selfservice.orders.listener;

import lombok.RequiredArgsConstructor;
import org.jmolecules.architecture.hexagonal.PrimaryAdapter;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderCreatedUseCase;

@RequiredArgsConstructor
@PrimaryAdapter
public class OrderManagementOrderListener {
   private OrderCreatedUseCase orderCreatedUseCase;
   private OrderManagementOrderConverter orderManagementOrderConverter;

   public void onMessage(OrderDto orderDto) {
      orderCreatedUseCase.createOrder(orderManagementOrderConverter.toDomain(orderDto));
   }
}
