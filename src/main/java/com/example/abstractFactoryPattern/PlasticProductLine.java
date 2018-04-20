package com.example.abstractFactoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName PlasticProductLine
*@Description TODO
*@Author zhangrui
*@Date 15:13 15:13
*@Version 
* */
public class PlasticProductLine implements Packaging {
    @Override
    public void givePackage() {
        System.out.println("生产塑料包装");
    }
}
