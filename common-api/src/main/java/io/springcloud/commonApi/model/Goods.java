package io.springcloud.commonApi.model;

public class Goods {
    private String id;
    private String name;
    private String desc;
    private Integer cost;

    public Goods() {
    }

    public Goods(String id, String name, String desc, Integer cost) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", cost=" + cost +
                '}';
    }
}
