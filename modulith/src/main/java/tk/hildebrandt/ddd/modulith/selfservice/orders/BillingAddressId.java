package tk.hildebrandt.ddd.modulith.selfservice.orders;

import lombok.*;
import org.jmolecules.ddd.types.Identifier;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class BillingAddressId implements Identifier, Serializable {
   private UUID id;

   public static BillingAddressId billingAddressId(){
      return billingAddressId(UUID.randomUUID());
   }
   public static BillingAddressId billingAddressId(UUID value){
      return new BillingAddressId(value);
   }
}

