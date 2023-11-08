package tk.hildebrandt.ddd.modulith.selfservice.orders.listener;


import tk.hildebrandt.ddd.modulith.selfservice.orders.Order;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItem;

import java.util.stream.Collectors;

import static tk.hildebrandt.ddd.modulith.selfservice.accounts.AccountId.accountId;
import static tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId.orderId;
import static tk.hildebrandt.ddd.modulith.selfservice.orders.OrderItemId.orderItemId;
import static tk.hildebrandt.ddd.modulith.selfservice.orders.ProductId.productId;

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
