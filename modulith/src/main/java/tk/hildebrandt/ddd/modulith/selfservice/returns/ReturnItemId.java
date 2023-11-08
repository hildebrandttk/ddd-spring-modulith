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
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class ReturnItemId implements Identifier, Serializable {
   private UUID id;

   public static ReturnItemId returnItemId() {
      return returnItemId(UUID.randomUUID());
   }

   public static ReturnItemId returnItemId(UUID value) {
      return new ReturnItemId(value);
   }
}
