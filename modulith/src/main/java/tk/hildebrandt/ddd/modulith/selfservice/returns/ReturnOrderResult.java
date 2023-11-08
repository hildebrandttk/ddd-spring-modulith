package tk.hildebrandt.ddd.modulith.selfservice.returns;

import java.util.List;

import org.jmolecules.ddd.annotation.ValueObject;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReturnOrderResult {
   private Return aReturn;
   private List<ReturnOrderError> returnOrderErrors;
}
