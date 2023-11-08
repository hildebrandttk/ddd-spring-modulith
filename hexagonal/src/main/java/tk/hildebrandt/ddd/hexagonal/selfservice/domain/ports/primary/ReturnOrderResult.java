package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary;

import java.util.List;

import org.jmolecules.ddd.annotation.ValueObject;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.Return;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.ReturnOrderError;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReturnOrderResult {
   private Return aReturn;
   private List<ReturnOrderError> returnOrderErrors;
}
