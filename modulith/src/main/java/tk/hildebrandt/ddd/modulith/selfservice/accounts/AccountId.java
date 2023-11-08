package tk.hildebrandt.ddd.modulith.selfservice.accounts;

import java.io.Serializable;
import java.util.UUID;

import org.jmolecules.ddd.types.Identifier;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
@Embeddable
public class AccountId implements Identifier, Serializable {
   private UUID id;

   public static AccountId accountId() {
      return accountId(UUID.randomUUID());
   }

   public static AccountId accountId(UUID value) {
      return new AccountId(value);
   }
}
