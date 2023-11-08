package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.accounts;

import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountId implements Identifier {
   private String value;
   public static AccountId accountId(String value){
      return new AccountId(value);
   }
}
