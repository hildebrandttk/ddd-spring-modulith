package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns;

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
public class ReturnItem {
   @Identity
   private ReturnItemId id;
   private OrderItemId affectedOrderItem;
   private int quantity;
   private String reason;
}
