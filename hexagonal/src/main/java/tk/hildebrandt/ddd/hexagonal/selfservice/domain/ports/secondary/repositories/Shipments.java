package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.jmolecules.ddd.annotation.Repository;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.Shipment;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.shipments.ShipmentId;

@Repository
@SecondaryPort
public interface Shipments {
   Shipment loadShipment(ShipmentId shipmentId);

   Shipment persist(Shipment unshippedShipment);
}
