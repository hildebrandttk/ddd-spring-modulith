package tk.hildebrandt.ddd.modulith.selfservice.returns.persistence;

import java.util.UUID;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnId;

import static tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnId.returnId;

@Converter(autoApply = true)
class ReturnIdConverter implements AttributeConverter<ReturnId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final ReturnId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public ReturnId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : returnId(dbData);
   }
}
