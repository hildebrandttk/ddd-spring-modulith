package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;

import java.time.Instant;
import java.util.List;

import static tk.hildebrandt.ddd.modulith.selfservice.shipments.ShipmentId.shipmentId;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Shipment {
   @Id
   @Builder.Default
   private ShipmentId id = shipmentId();
   @OneToMany(cascade = CascadeType.ALL)
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
