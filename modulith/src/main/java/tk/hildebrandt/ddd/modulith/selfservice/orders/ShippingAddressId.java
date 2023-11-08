package tk.hildebrandt.ddd.modulith.selfservice.orders;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jmolecules.ddd.annotation.ValueObject;
import org.jmolecules.ddd.types.Identifier;

import java.io.Serializable;
import java.util.UUID;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ShippingAddressId implements Serializable, Identifier {
   private UUID value;
   public static ShippingAddressId shippingAddressId(){
      return shippingAddressId(UUID.randomUUID());
   }
   public static ShippingAddressId shippingAddressId(UUID value){
      return new ShippingAddressId(value);
   }
}
