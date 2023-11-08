package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShippedItemId {
   private String value;

   public static ShippedItemId shipmentId(String value) {
      return new ShippedItemId(value);
   }
}
