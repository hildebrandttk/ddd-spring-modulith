package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import lombok.*;
import org.jmolecules.ddd.types.Identifier;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode
public class ShippedItemId implements Identifier, Serializable {
      private UUID id;

   public static ShippedItemId shippedItemId() {
      return shippedItemId(UUID.randomUUID());
   }
   public static ShippedItemId shippedItemId(UUID value) {
      return new ShippedItemId(value);
   }
}
