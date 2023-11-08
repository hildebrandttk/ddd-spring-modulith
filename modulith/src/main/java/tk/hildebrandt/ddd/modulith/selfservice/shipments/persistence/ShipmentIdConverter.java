package tk.hildebrandt.ddd.modulith.selfservice.shipments.persistence;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.shipments.ShipmentId;

import java.util.UUID;

import static tk.hildebrandt.ddd.modulith.selfservice.shipments.ShipmentId.shipmentId;

@Converter(autoApply = true)
class ShipmentIdConverter implements AttributeConverter<ShipmentId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final ShipmentId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public ShipmentId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : shipmentId(dbData);
   }
}
