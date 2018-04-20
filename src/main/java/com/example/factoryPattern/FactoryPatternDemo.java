package com.example.factoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName FactoryPatternDemo
*@Description TODO
*@Author zhangrui
*@Date 11:00 11:00
*@Version 
* */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        //声明一个工厂
        FoodFactory foodFactory = new FoodFactory();
        //订单
        String[] order = {"noodle","dumpling"};
        //购货商向工厂下发订单,经过食品厂操作后返回结果
        String meg = foodFactory.creatFood(order);
        //对返回的结果进行输出
        System.out.println(meg);
    }
}
