package com.example.flyweightPattern;

/**
 * Created by zhangrui on 2018/6/1.
 */
/*
* @ClassName Baozi
*@Description TODO 创建实体类,定义自有属性,实现食物接口,重写make方法
*@Author zhangrui
*@Date 14:47 14:47
*@Version 
* */
public class Baozi implements Food {
    private String name;
    private String size;
    private String type;
    private double price;

    public Baozi() {
    }

    public Baozi(String type) {
        this.type = type;
    }

    public Baozi(String name, String size, String type, double price) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void make() {
        this.type = type;
        this.price = price;
        this.name = name;
        this.size = size;
        System.out.println("这个包子的名字是:"+name+"大小是:"+size+"类型是:"+type+"价格是:"+price);
    }

}
