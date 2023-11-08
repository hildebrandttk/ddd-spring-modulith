package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShipmentFinishedUseCase {

    private final Shipments shipments;

    public Shipment prepareShipping(OrderId orderId, List<ShippedItem> shippedItems,
                                    String trackingId, String serviceProvider) {
        Shipment unshippedShipment = Shipment.builder()
                .containedItems(shippedItems)
                .forOrder(orderId)
                .trackingId(trackingId)
                .serviceProvider(serviceProvider)
                .build();
        return shipments.persist(unshippedShipment);
    }

    public void handoverToServiceProvider(ShipmentId shipmentId) {
        Shipment shipment = shipments.loadShipment(shipmentId);
        shipment.handoverToServiceProvider();
    }

    public void shipmentFinished(ShipmentId shipmentId, Instant finishedDate, ShipmentResult result) {
        Shipment shipment = shipments.loadShipment(shipmentId);
        shipment.finish(finishedDate, result);
    }
}
