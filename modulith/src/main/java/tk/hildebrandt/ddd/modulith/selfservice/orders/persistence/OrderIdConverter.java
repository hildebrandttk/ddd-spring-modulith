package tk.hildebrandt.ddd.modulith.selfservice.orders.persistence;

import java.util.UUID;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;

import static tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId.orderId;

@Converter
class OrderIdConverter implements AttributeConverter<OrderId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final OrderId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public OrderId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : orderId(dbData);
   }
}
