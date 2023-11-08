package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderId {
   private String value;
   public static OrderId orderId(String value){
      return new OrderId(value);
   }
}
