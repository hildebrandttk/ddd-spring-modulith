package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId;

import java.time.Instant;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShippedItem {
   @Id
   private ShippedItemId shippedItemId;
   private OrderItemId orderItemId;
   private Instant quantity;
}
