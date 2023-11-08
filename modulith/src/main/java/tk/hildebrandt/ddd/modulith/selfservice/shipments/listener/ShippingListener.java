package tk.hildebrandt.ddd.modulith.selfservice.shipments.listener;

import org.jmolecules.architecture.hexagonal.PrimaryAdapter;
import tk.hildebrandt.ddd.modulith.selfservice.orders.listener.OrderDto;
import tk.hildebrandt.ddd.modulith.selfservice.shipments.ShipmentFinishedUseCase;

@PrimaryAdapter
public class ShippingListener {

    private ShipmentFinishedUseCase shipmentFinishedUseCase;
//    private Shipments shipments;

    public void onMessage(String message) {
//        Shipment shipment = shipments.loadShipment(shipmentId("ad"));
        shipmentFinishedUseCase.shipmentFinished(null, null, null);
    }


}
