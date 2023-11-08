package tk.hildebrandt.ddd.modulith.selfservice.returns;

import java.util.Collections;
import java.util.List;

import org.jmolecules.ddd.annotation.Association;
import org.jmolecules.ddd.types.AggregateRoot;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tk.hildebrandt.ddd.modulith.selfservice.orders.Order;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;

import static tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnId.returnId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Return implements AggregateRoot<Return, ReturnId> {
   @Id
   @Builder.Default
   private ReturnId id = returnId();

   private OrderId forOrder;

   @Association
   @OneToMany(cascade = CascadeType.ALL)
   private List<ReturnItem> returnItems;

   public List<ReturnOrderError> isValidForOrder(Order order) {
      return Collections.emptyList();
   }
}
