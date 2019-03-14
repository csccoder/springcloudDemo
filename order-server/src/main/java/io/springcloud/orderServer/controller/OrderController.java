package io.springcloud.orderServer.controller;

import io.springcloud.commonApi.bean.Result;
import io.springcloud.commonApi.model.Order;
import io.springcloud.orderServer.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/place")
    public Result placeOrder(Order order) throws Exception {

        this.orderService.placeOrder(order);
        return Result.success();
    }
}