package tk.hildebrandt.ddd.modulith.selfservice.orders;

import java.util.Optional;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import org.springframework.data.jpa.repository.JpaRepository;

@SecondaryAdapter
interface Orders extends JpaRepository<Order, OrderId> {
   default Optional<Order> findOrder(OrderId orderId) {
      return findById(orderId);
   }

   default Order persist(Order newOrder) {
      return save(newOrder);
   }
}
