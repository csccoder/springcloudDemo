package io.springcloud.goodsServer.service;

import io.springcloud.commonApi.model.Goods;

public interface IGoodsService {
    Goods findGoodsById(String goodsId);
}
