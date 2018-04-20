package com.example.singletonPattern;

/**
 * Created by zhangrui on 2018/4/18.
 */
/*
* @ClassName SingletonPatternDemo
*@Description TODO
*@Author zhangrui
*@Date 17:40 17:40
*@Version 
* */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //私有不能实例化
        //SingletonPatternObject singletonPatternObject = new SingletonPatternObject();

        SingletonPatternObject singletonPatternObject = SingletonPatternObject.getSingletonPatternObjectInstance();
        singletonPatternObject.showMessage();
    }
}
