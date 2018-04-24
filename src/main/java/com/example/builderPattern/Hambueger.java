package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName Hambueger
*@Description TODO 汉堡类 选择性实现事物的接口
*@Author zhangrui
*@Date 16:38 16:38
*@Version 
* */
public abstract class Hambueger implements TopFoodItem {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price() ;
}
