package tk.hildebrandt.ddd.modulith.selfservice.returns;

import org.jmolecules.ddd.types.AggregateRoot;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId;

import static tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId.orderItemId;
import static tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnItemId.returnItemId;

@jakarta.persistence.Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReturnItem  {
   @Id
   @Builder.Default
   private ReturnItemId id = returnItemId();
   private OrderItemId affectedOrderItem;
   private int quantity;
   private String reason;
}
