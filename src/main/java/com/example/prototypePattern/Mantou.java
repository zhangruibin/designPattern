package com.example.prototypePattern;

/**
 * Created by zhangrui on 2018/4/25.
 */
/*
* @ClassName Mantou
*@Description TODO
*@Author zhangrui
*@Date 11:24 11:24
*@Version 
* */
public class Mantou extends Food {
    public Mantou(){
        name = "mantou";
        test = "test";
    }
    @Override
    void creat() {
        System.out.println("调用到了馒头类里面的create()方法");
    }
}
