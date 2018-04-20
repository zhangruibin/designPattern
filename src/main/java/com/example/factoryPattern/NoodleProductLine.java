package com.example.factoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName NoodleProductLine
*@Description TODO 面条类(类比生产线) 这条生产线具有生产食物的资质 根据自身需求专门用来生产--面条
*@Author zhangrui
*@Date 10:30 10:30
*@Version 
* */
public class NoodleProductLine implements Food{
    @Override
    public String creat() {
        return creatNoodle();
    }
    private String creatNoodle() {
        return "工厂生产了面条(I'm a noodle)";
    }
}
