package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName Bottle
*@Description TODO 瓶装类,继承了包装接口
*@Author zhangrui
*@Date 16:46 16:46
*@Version 
* */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle----->瓶装";
    }
}
