package io.springcloud.goodsServer.controller;

import io.springcloud.commonApi.bean.Result;
import io.springcloud.commonApi.model.Goods;
import io.springcloud.goodsServer.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("/goodsInfo/{goodsId}")
    public Result goodsInfo(@PathVariable String goodsId) {

        Goods goods = this.goodsService.findGoodsById(goodsId);
        return Result.success(goods);
    }
}
