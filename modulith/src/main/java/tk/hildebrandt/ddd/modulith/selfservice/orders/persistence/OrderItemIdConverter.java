package tk.hildebrandt.ddd.modulith.selfservice.orders.persistence;

import java.util.UUID;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId;

import static tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId.orderItemId;

@Converter
class OrderItemIdConverter implements AttributeConverter<OrderItemId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final OrderItemId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public OrderItemId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : orderItemId(dbData);
   }
}
