package com.example.abstractFactoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName AbstractFactoryPatternDemo
*@Description TODO
*@Author zhangrui
*@Date 15:41 15:41
*@Version 
* */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        String[] orderA = {"food"};
        String[] foodOrder = {"noodle","dumpling"};
        //获取食品工厂
        AbstractFactory abstractFactory = FactoryProducer.getFactory(orderA);
        abstractFactory.creatFood(foodOrder);
        String[] orderB = {"package"};
        String[] packageOrder = {"paper","plastic"};
        abstractFactory = FactoryProducer.getFactory(orderB);
        abstractFactory.creatPackage(packageOrder);
    }
}
