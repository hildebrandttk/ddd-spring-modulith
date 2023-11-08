package tk.hildebrandt.ddd.modulith.selfservice.accounts;

import org.jmolecules.ddd.annotation.Identity;
import org.jmolecules.ddd.types.AggregateRoot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE) //for jpa
@AllArgsConstructor
@IdClass(AccountId.class)
public class Account implements AggregateRoot<Account, AccountId> {
   @Identity
   @Id
   private AccountId id;
   private String name;
   private String firstname;
}
