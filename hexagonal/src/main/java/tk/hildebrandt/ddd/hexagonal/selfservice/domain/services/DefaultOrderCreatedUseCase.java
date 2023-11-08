package tk.hildebrandt.ddd.hexagonal.selfservice.domain.services;

import org.jmolecules.ddd.annotation.Service;

import lombok.RequiredArgsConstructor;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.Order;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary.OrderCreatedUseCase;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Orders;

@Service
@RequiredArgsConstructor
class DefaultOrderCreatedUseCase implements OrderCreatedUseCase {
   private Orders orders;
   @Override
   public OrderId createOrder(Order newOrder) {
      return orders.persist(newOrder).getId();
   }
}
