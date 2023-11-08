package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.secondary.persistence;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.Order;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Orders;

@SecondaryAdapter
class OrderRepository implements Orders {
   public Order findOrder(OrderId orderId) {
      return null;
   }

   @Override
   public Order persist(Order newOrder) {
      return newOrder;
   }
}
