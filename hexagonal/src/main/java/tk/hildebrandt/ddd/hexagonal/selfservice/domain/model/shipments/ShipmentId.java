package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments;

import org.jmolecules.ddd.annotation.ValueObject;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShipmentId {
   private String value;

   public static ShipmentId shipmentId(String value) {
      return new ShipmentId(value);
   }
}
