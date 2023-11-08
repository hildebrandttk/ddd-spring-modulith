package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary;

import java.util.List;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.ReturnItem;

@PrimaryPort
public interface ReturnOrderUseCase {
   ReturnOrderResult returnOrder(OrderId orderId, List<ReturnItem> returnItems);
}
