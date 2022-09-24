package com.ichan.eshop.service;

import com.ichan.eshop.dto.CreateOrderRequest;
import com.ichan.eshop.dto.OrderQueryParams;
import com.ichan.eshop.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
