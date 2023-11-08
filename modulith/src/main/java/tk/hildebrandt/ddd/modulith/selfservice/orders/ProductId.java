package tk.hildebrandt.ddd.modulith.selfservice.orders;

import java.io.Serializable;

import org.jmolecules.ddd.annotation.ValueObject;
import org.jmolecules.ddd.types.Identifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductId implements Serializable, Identifier {
   private String value;
   public static ProductId productId(String value){
      return new ProductId(value);
   }
}
