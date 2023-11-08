package tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments;

import java.time.Instant;
import java.util.List;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.MODULE)
public class Shipment {
   @Identity
   private ShipmentId id;
   private List<ShippedItem> containedItems;
   private OrderId forOrder;
   private Instant shippingDate;
   private Instant deliveryDate;
   private String serviceProvider;
   private String trackingId;
   private ShipmentResult result;

   public void finish(Instant finishedDate, ShipmentResult result) {
      this.result = result;
      if(result == ShipmentResult.SUCCESS){
         deliveryDate = finishedDate;
      }
   }

   public void handoverToServiceProvider() {
      this.shippingDate = Instant.now();
   }
}
