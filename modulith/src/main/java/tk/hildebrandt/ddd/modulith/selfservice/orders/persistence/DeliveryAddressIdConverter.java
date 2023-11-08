package tk.hildebrandt.ddd.modulith.selfservice.orders.persistence;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.orders.BillingAddressId;

import java.util.UUID;

import static tk.hildebrandt.ddd.modulith.selfservice.orders.BillingAddressId.billingAddressId;

@Converter
class DeliveryAddressIdConverter implements AttributeConverter<BillingAddressId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final BillingAddressId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public BillingAddressId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : billingAddressId(dbData);
   }
}
