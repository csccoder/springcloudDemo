package io.springcloud.commonApi.bean;

import io.springcloud.commonApi.model.Goods;

public class Result {
    private  int code;
    private Goods data;

    public Result() {
    }

    public Result(int code, Goods data) {
        this.code = code;
        this.data = data;
    }

    public static Result success(Goods obj){
        return new Result(200,obj);
    }

    public static Result success(){
        return new Result(200,null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Goods getData() {
        return data;
    }

    public void setData(Goods data) {
        this.data = data;
    }
}
