package io.springcloud.goodsServer.service.impl;

import io.springcloud.commonApi.model.Goods;
import io.springcloud.goodsServer.service.IGoodsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class GoodsService implements IGoodsService {

    // 模拟数据库
    private static Map<String, Goods> data;

    static {
        data = new HashMap<String,Goods>();
        data.put("1", new Goods("1", "手机", "国产手机", 8081));
        data.put("2", new Goods("2", "电脑", "台式电脑", 8081));
    }


    public Goods findGoodsById(String goodsId) {
        return data.get(goodsId);
    }
}
