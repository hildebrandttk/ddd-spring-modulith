package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.primary.order;

import org.jmolecules.architecture.hexagonal.PrimaryAdapter;
import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.Shipment;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.primary.ShipmentFinishedUseCase;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Shipments;

import static tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.ShipmentId.shipmentId;

@PrimaryAdapter
public class ShippingListener {

    private ShipmentFinishedUseCase shipmentFinishedUseCase;
//    private Shipments shipments;

    public void onMessage(OrderDto orderDto) {
//        Shipment shipment = shipments.loadShipment(shipmentId("ad"));
        shipmentFinishedUseCase.shipmentFinished(null, null, null, null);
    }


}
