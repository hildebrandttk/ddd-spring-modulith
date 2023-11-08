package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import org.springframework.data.jpa.repository.JpaRepository;

interface JpaShipmentRepository extends Shipments, JpaRepository<Shipment, ShipmentId> {
    default Shipment loadShipment(ShipmentId shipmentId) {
        return findById(shipmentId).orElseThrow(ShipmentNotPresentException::new);
    }

    default Shipment persist(Shipment unshippedShipment) {
        return save(unshippedShipment);
    }
}
