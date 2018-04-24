package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName Drink
*@Description TODO 饮料类 选择性实现食物接口
*@Author zhangrui
*@Date 16:38 16:38
*@Version 
* */
public abstract class Drink implements TopFoodItem {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price() ;
}
