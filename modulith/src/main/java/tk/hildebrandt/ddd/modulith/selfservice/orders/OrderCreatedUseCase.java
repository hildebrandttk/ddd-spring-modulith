package tk.hildebrandt.ddd.modulith.selfservice.orders;

import org.jmolecules.ddd.annotation.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderCreatedUseCase {
   private Orders orders;
   public OrderId createOrder(Order newOrder) {
      Order persistedOrder = orders.persist(newOrder);
      return persistedOrder.getId();
   }
}
