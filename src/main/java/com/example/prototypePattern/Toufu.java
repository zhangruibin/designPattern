package com.example.prototypePattern;

/**
 * Created by zhangrui on 2018/4/25.
 */
/*
* @ClassName Toufu
*@Description TODO
*@Author zhangrui
*@Date 11:26 11:26
*@Version 
* */
public class Toufu extends Food {
    public Toufu(){
        name = "toufu";
        test = "test";
    }
    @Override
    void creat() {
        System.out.println("调用到了豆腐类的create()方法");
    }
}
