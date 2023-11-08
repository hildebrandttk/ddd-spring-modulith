package tk.hildebrandt.ddd.modulith.selfservice.orders;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
   private final Orders orders;

   public Optional<Order> findOrder(OrderId orderId) {
      return orders.findById(orderId);
   }
}
