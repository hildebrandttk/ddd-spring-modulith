package tk.hildebrandt.ddd.modulith.selfservice.orders;

import java.io.Serializable;
import java.util.UUID;

import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class OrderId implements Identifier, Serializable {
   private UUID id;

   public static OrderId orderId() {
      return orderId(UUID.randomUUID());
   }
   public static OrderId orderId(UUID value) {
      return new OrderId(value);
   }
}
