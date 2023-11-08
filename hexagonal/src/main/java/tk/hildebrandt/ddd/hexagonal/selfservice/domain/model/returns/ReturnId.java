package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns;

import org.jmolecules.ddd.annotation.ValueObject;
import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReturnId {
   private String value;
   public static ReturnId returnId(String value){
      return new ReturnId(value);
   }
}
