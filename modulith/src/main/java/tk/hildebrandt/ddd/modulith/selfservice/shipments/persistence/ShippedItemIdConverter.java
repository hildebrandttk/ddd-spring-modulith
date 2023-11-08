package tk.hildebrandt.ddd.modulith.selfservice.shipments.persistence;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.shipments.ShippedItemId;

import java.util.UUID;

import static tk.hildebrandt.ddd.modulith.selfservice.shipments.ShippedItemId.shippedItemId;

@Converter(autoApply = true)
class ShippedItemIdConverter implements AttributeConverter<ShippedItemId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final ShippedItemId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public ShippedItemId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : shippedItemId(dbData);
   }
}
