package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.primary.order;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderItemDto {
   private String id;
   private String productId;
   private int quantity;
   private BigDecimal price;
}
