package com.example.flyweightPattern;

/**
 * Created by zhangrui on 2018/6/1.
 */
/*
* @ClassName FlyweightPatternDemo
*@Description TODO 享元模式的验证输出类,在这个类里面进行数据的填充和结果的验证输出
*@Author zhangrui
*@Date 15:06 15:06
*@Version 
* */
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        for (int i = 1;i < 10;i++){
            Baozi baozi = (Baozi) FoodFactory.getBaozi("qingfeng");
            if (i == 5){
                baozi = (Baozi) FoodFactory.getBaozi("goubuli");
                baozi.setPrice(i+0.00);
                baozi.setSize((i/2)==0?"big":"small");
                baozi.setType((i/2)==0?"su":"meet");
            }
            baozi.make();
        }
    }
}
