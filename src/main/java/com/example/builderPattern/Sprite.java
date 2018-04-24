package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName Sprite
*@Description TODO 雪碧类 继承了饮料类
*@Author zhangrui
*@Date 16:42 16:42
*@Version 
* */
public class Sprite extends Drink {
    @Override
    public String name() {
        return "柠檬味雪碧";
    }

    @Override
    public double price() {
        return 3.00;
    }
}
