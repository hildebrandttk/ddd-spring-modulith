package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns;

import java.util.Collections;
import java.util.List;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import jakarta.persistence.EmbeddedId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.Order;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class Return {
   @Identity
   @EmbeddedId
   private ReturnId id;
   private OrderId forOrder;
   private List<ReturnItem> returnItems;

   public List<ReturnOrderError> isValidForOrder(Order order) {
      return Collections.emptyList();
   }
}
