package com.example.decoracorPattern;

/**
 * Created by zhangrui on 2018/6/1.
 */
/*
* @ClassName DecoratorPatternDemo
*@Description TODO 创建不同的实例,验证输出
*@Author zhangrui
*@Date 9:38 9:38
*@Version 
* */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Food baozi = new Baozi() ;
        Food suBaozi = new SuFoodDecorator(baozi);
        Food jiaozi = new Jiaozi();
        Food suJiaozi = new SuFoodDecorator(new Jiaozi());
        System.out.println("new Baozi().make()>>>>");
        baozi.make();
        System.out.println("new SuFoodDecorator(baozi).make()>>>>");
        suBaozi.make();
        System.out.println("new Jiaozi().make()>>>>");
        jiaozi.make();
        System.out.println("new SuFoodDecorator(new Jiaozi()).make()>>>>");
        suJiaozi.make();
    }
}
