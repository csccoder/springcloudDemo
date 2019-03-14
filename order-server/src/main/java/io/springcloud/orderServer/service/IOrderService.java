package io.springcloud.orderServer.service;

import io.springcloud.commonApi.model.Order;

public interface IOrderService {
    void placeOrder(Order order) throws Exception;
}
