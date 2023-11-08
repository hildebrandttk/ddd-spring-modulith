package tk.hildebrandt.ddd.modulith.selfservice.orders;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.*;
import org.jmolecules.ddd.annotation.Association;
import org.jmolecules.ddd.annotation.Identity;
import org.jmolecules.ddd.types.AggregateRoot;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tk.hildebrandt.ddd.modulith.selfservice.accounts.AccountId;

@Entity
@Table(name = "orders")
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
@IdClass(OrderId.class)
public class Order implements AggregateRoot<Order, OrderId> {
   @Identity
   @Id
   private OrderId id;
   @Association
   @OneToMany
   private List<OrderItem> orderItems;
   @OneToOne(cascade = CascadeType.ALL)
   private BillingAddress billingAddress;
   @OneToOne(cascade = CascadeType.ALL)
   private ShippingAddress shippingAddress;
   private AccountId forAccount;
   private Instant orderDate;
}
