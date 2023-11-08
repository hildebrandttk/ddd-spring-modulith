package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders;

import java.time.Instant;
import java.util.List;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.accounts.AccountId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)

public class Order {
   @Identity
   private OrderId id;
   private List<OrderItem> orderItems;
   private AccountId forAccount;
   private Instant orderDate;
}
