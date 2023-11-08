package tk.hildebrandt.ddd.modulith.selfservice.returns;

import java.io.Serializable;
import java.util.UUID;

import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode
public class ReturnId implements Identifier, Serializable {
   private UUID id;

   public static ReturnId returnId() {
      return returnId(UUID.randomUUID());
   }

   public static ReturnId returnId(UUID value) {
      return new ReturnId(value);
   }
}
