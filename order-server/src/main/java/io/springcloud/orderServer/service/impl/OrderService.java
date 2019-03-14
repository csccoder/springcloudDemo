package io.springcloud.orderServer.service.impl;

import io.springcloud.commonApi.bean.Result;
import io.springcloud.commonApi.model.Order;
import io.springcloud.orderServer.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private RestTemplate restTemplate;

    //@Autowired
    //private DiscoveryClient client;

    public void placeOrder(Order order) throws Exception {
       /* //获取商品服务地址列表
        List<ServiceInstance> instances = this.client.getInstances("GOODS");
        String uri = null;
        for(ServiceInstance instance : instances){
            if(instance.getUri()!=null && !instance.getUri().equals("")){
                uri = instance.getUri().toString();
                break;
            }
        }*/

        Result result = restTemplate.getForObject(new URI(  "http://GOODS/goods/goodsInfo/" + order.getGoodsId()), Result.class);

        if (result != null && result.getCode() == 200) {
            System.out.println("=====下订单====");
            System.out.println(result.getData());
        }

    }
}
