package com.example.abstractFactoryPattern;

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
public abstract class AbstractFactory {
    abstract Food creatFood(String... foodOrder);
    abstract Packaging creatPackage(String... packageOrder);
}
