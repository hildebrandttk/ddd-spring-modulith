package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.primary.order;

import java.time.Instant;
import java.util.List;

import lombok.Data;

@Data
public class OrderDto {
   private String orderId;
   private String accountId;
   private Instant orderDate;
   private List<OrderItemDto> orderItems;
}
