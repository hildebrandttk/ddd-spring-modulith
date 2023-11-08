package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.jmolecules.ddd.annotation.Repository;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.Order;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;

@Repository
@SecondaryPort
public interface Orders {
   Order findOrder(OrderId orderId);

   Order persist(Order newOrder);
}
