package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments;

import java.time.Instant;

import org.jmolecules.ddd.annotation.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Identity;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderItemId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class ShippedItem {
   @Identity
   private ShippedItemId id;
   private OrderItemId orderItemId;
   private Instant quantity;
}
