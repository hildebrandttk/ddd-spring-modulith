package tk.hildebrandt.ddd.modulith.selfservice.orders.listener;

import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
public class OrderDto {
   private UUID orderId;
   private UUID accountId;
   private Instant orderDate;
   private List<OrderItemDto> orderItems;
}
