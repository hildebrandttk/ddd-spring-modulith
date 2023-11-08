package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders;

import java.math.BigDecimal;
import java.time.Instant;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class OrderItem {
   @Identity
   private OrderItemId id;
   private ProductId productId;
   private BigDecimal price;
   private int quantity;
   private Instant deliveredAt;
}

