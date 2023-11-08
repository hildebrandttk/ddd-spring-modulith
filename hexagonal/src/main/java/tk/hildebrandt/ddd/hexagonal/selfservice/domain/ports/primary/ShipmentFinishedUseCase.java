package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary;

import java.util.List;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.Shipment;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.ShippedItem;

@PrimaryPort
public interface ShipmentFinishedUseCase {
   Shipment shipmentFinished(OrderId orderId, List<ShippedItem> shippedItems,
                             String trackingId, String serviceProvider);
}
