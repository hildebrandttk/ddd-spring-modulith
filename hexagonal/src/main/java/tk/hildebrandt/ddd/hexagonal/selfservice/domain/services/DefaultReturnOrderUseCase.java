package tk.hildebrandt.ddd.hexagonal.selfservice.domain.services;

import java.util.List;

import org.jmolecules.ddd.annotation.Service;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.Return;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.ReturnItem;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.ReturnOrderError;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary.ReturnOrderResult;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary.ReturnOrderUseCase;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Orders;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Returns;

@Service
class DefaultReturnOrderUseCase implements ReturnOrderUseCase {
   private Orders orderPersistenceGateway;
   private Returns returns;

   @Override
   public ReturnOrderResult returnOrder(OrderId orderId, List<ReturnItem> returnItems) {
      Return aReturn = Return.builder()
                             .forOrder(orderId)
                             .returnItems(returnItems)
                             .build();
      List<ReturnOrderError> returnOrderErrors = aReturn.isValidForOrder(orderPersistenceGateway.findOrder(orderId));
      ReturnOrderResult.ReturnOrderResultBuilder resultBuilder = ReturnOrderResult.builder();
      if (returnOrderErrors.isEmpty()) {
         returns.persist(aReturn);
         resultBuilder.aReturn(aReturn);
      } else {
         resultBuilder.returnOrderErrors(returnOrderErrors);
      }
      return resultBuilder
         .build();
   }
}
