package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders;

import org.jmolecules.ddd.annotation.ValueObject;
import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderItemId implements Identifier {
   private String value;
   public static OrderItemId orderItemId(String value){
      return new OrderItemId(value);
   }
}
