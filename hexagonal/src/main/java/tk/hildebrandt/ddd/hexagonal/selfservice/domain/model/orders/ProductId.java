package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders;

import org.jmolecules.ddd.annotation.ValueObject;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductId {
   private String value;
   public static ProductId productId(String value){
      return new ProductId(value);
   }
}
