package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.Order;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;

@PrimaryPort
public interface OrderCreatedUseCase {

   OrderId createOrder(Order newOrder);
}
