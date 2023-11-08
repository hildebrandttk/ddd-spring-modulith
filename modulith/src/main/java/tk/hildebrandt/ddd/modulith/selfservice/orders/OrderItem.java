package tk.hildebrandt.ddd.modulith.selfservice.orders;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Identity;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class OrderItem {

    @Id
    @Identity
    private OrderItemId id;
    private ProductId productId;
    private BigDecimal price;
    private int quantity;
    private Instant deliveredAt;
}

