package tk.hildebrandt.ddd.hexagonal.selfservice.domain.services;

import java.time.Instant;
import java.util.List;

import org.jmolecules.ddd.annotation.Service;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.Shipment;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.ShipmentId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.ShipmentResult;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.ShippedItem;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary.ShipmentFinishedUseCase;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Shipments;

@Service
class DefaultShipmentFinishedUseCase implements ShipmentFinishedUseCase {

   private Shipments shipments;

   @Override
   public Shipment shipmentFinished(OrderId orderId, List<ShippedItem> shippedItems,
                                    String trackingId, String serviceProvider) {
      Shipment unshippedShipment = Shipment.builder()
                               .containedItems(shippedItems)
                               .forOrder(orderId)
                               .trackingId(trackingId)
                               .serviceProvider(serviceProvider)
                               .build();
      return shipments.persist(unshippedShipment);
   }

   public void handoverToServiceProvider(ShipmentId shipmentId){
      Shipment shipment = shipments.loadShipment(shipmentId);
      shipment.handoverToServiceProvider();
   }

   public void shipmentFinished(ShipmentId shipmentId, Instant finishedDate, ShipmentResult result) {
      Shipment shipment = shipments.loadShipment(shipmentId);
      shipment.finish(finishedDate, result);
   }
}
