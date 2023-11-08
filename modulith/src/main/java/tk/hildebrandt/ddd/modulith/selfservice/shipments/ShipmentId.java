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
public class ShipmentId implements Identifier, Serializable {
      private UUID id;

   public static ShipmentId shipmentId() {
      return shipmentId(UUID.randomUUID());
   }
   public static ShipmentId shipmentId(UUID value) {
      return new ShipmentId(value);
   }
}
