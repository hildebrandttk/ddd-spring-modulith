package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.jmolecules.ddd.annotation.Repository;

@Repository
@SecondaryPort
public interface Shipments {
   Shipment loadShipment(ShipmentId shipmentId);

   Shipment persist(Shipment unshippedShipment);
}
