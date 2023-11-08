package tk.hildebrandt.ddd.modulith.selfservice.orders;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.jmolecules.ddd.annotation.Identity;

import static tk.hildebrandt.ddd.modulith.selfservice.orders.ShippingAddressId.shippingAddressId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
@NoArgsConstructor(access = AccessLevel.MODULE)
public class ShippingAddress {
   @Id
   @Identity
   @Builder.Default
   private ShippingAddressId id = shippingAddressId();
   private String name;
   private String street;
   private String zipCode;
   private String city;
}
