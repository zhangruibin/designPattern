package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName CocaCola
*@Description TODO 可口可乐类 继承了饮料类
*@Author zhangrui
*@Date 16:41 16:41
*@Version 
* */
public class CocaCola extends Drink {
    @Override
    public String name() {
        return "蓝莓味可口可乐";
    }

    @Override
    public double price() {
        return 6.00;
    }
}
