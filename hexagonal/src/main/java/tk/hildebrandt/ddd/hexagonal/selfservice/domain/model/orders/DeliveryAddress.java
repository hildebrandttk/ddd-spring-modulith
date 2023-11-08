package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders;

import org.jmolecules.ddd.annotation.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Identity;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class DeliveryAddress {
   @Identity
   private DeliveryAddress id;
   private String name;
   private String street;
   private String zipCode;
   private String city;
}
