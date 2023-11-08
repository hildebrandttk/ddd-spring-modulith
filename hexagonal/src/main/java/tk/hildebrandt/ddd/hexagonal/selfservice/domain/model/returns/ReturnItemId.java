package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns;

import java.util.UUID;

import org.jmolecules.ddd.annotation.ValueObject;
import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReturnItemId implements Identifier {
   private UUID id;
   public static ReturnItemId returnItemId(UUID value){
      return new ReturnItemId(value);
   }
}
