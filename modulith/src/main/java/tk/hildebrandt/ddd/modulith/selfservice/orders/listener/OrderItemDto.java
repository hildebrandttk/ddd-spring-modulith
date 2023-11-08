package tk.hildebrandt.ddd.modulith.selfservice.orders.listener;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class OrderItemDto {
   private UUID id;
   private String productId;
   private int quantity;
   private BigDecimal price;
}
