package com.example.factoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName DumplingProductLine
*@Description TODO 饺子类(类比生产线) 这条生产线具有生产食物的资质 根据自身需求专门用来生产--饺子
*@Author zhangrui
*@Date 10:31 10:31
*@Version 
* */
public class DumplingProductLine implements Food{
    @Override
    public String creat() {
        return  ceretDumpling();
    }

    private String ceretDumpling() {
        return "工厂生产了饺子(I'm a fresh dumpling)";
    }
}
