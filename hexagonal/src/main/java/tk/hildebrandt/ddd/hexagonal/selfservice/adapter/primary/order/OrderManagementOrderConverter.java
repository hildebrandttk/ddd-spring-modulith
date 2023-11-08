package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.primary.order;

import java.util.stream.Collectors;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.Order;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderItem;

import static tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.accounts.AccountId.accountId;
import static tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderId.orderId;
import static tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.OrderItemId.orderItemId;
import static tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.orders.ProductId.productId;

public class
OrderManagementOrderConverter {

   Order toDomain(OrderDto orderDto) {
      return Order.builder()
                  .id(orderId(orderDto.getOrderId()))
                  .orderDate(orderDto.getOrderDate())
                  .forAccount(accountId(orderDto.getAccountId()))
                  .orderItems(orderDto.getOrderItems()
                                      .stream()
                                      .map(this::orderItemToDomain)
                                      .collect(Collectors.toList()))
                  .build();
   }

   private OrderItem orderItemToDomain(OrderItemDto dto) {
      return OrderItem.builder()
                      .id(orderItemId(dto.getId()))
                      .price(dto.getPrice())
                      .productId(productId(dto.getProductId()))
                      .build();
   }
}
