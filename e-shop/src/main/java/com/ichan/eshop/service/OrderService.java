package com.ichan.eshop.service;

import com.ichan.eshop.dto.CreateOrderRequest;
import com.ichan.eshop.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
