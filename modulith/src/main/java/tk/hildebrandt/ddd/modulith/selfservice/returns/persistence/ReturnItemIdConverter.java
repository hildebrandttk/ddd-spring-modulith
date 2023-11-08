package tk.hildebrandt.ddd.modulith.selfservice.returns.persistence;

import java.util.UUID;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnItemId;

import static tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnItemId.returnItemId;

@Converter(autoApply = true)
class ReturnItemIdConverter implements AttributeConverter<ReturnItemId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final ReturnItemId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public ReturnItemId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : returnItemId(dbData);
   }
}
