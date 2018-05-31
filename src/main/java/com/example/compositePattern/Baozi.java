package com.example.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangrui on 2018/5/31.
 */
/*
* @ClassName Baozi
*@Description TODO
*@Author zhangrui
*@Date 14:05 14:05
*@Version 
* */
public class Baozi {
    private String name;
    private String type;
    private double price;
    private List<Baozi> baoziList;
    //根据传入的包子的属性来生成包子
    public  Baozi(String name,String type,double price){
        this.name = name;
        this.type = type;
        this.price = price;
        baoziList = new ArrayList<Baozi>();

    }
    //往列表里面添加一个包子
    public void add(Baozi baozi){
        baoziList.add(baozi);
    }
    //移除一个包子
    public void remove(Baozi baozi){
        baoziList.remove(baozi);
    }
    public List<Baozi> getBaoziList(){
        return baoziList;
    }

    //生成getset方法,使用lombok可以省略这些
    //重写toStribng()方法

    @Override
    public String toString() {
        return "这个包子--{" +
                "名字叫做:='" + name + '\'' +
                ", 类型是:='" + type + '\'' +
                ", 价格是:=" + price +
                ", 包子列表是:=" + baoziList +
                '}';
    }
}
