package tk.hildebrandt.ddd.modulith.selfservice.orders;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Identity;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class BillingAddress {
    @Id
    @Identity
    @Builder.Default
    private BillingAddressId id = BillingAddressId.billingAddressId();
    private String name;
    private String street;
    private String zipCode;
    private String city;
}
