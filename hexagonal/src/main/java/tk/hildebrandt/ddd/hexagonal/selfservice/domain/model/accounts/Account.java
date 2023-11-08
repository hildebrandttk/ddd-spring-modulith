package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.accounts;

import lombok.*;
import org.jmolecules.ddd.annotation.Identity;
import org.jmolecules.ddd.types.AggregateRoot;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE) //for jpa
@AllArgsConstructor
public class Account implements AggregateRoot<Account, AccountId> {
    @Identity
    private AccountId id;
    private String name;
    private String firstname;
}
