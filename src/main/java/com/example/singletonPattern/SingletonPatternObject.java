package com.example.singletonPattern;

/**
 * Created by zhangrui on 2018/4/18.
 */
/*
* @ClassName SingletonPatternObject
*@Description TODO
*@Author zhangrui
*@Date 17:33 17:33
*@Version
* */
public class SingletonPatternObject {
    private static SingletonPatternObject singletonPatternObjectInstance = new SingletonPatternObject();
    private SingletonPatternObject(){}
    public static SingletonPatternObject getSingletonPatternObjectInstance(){
        return singletonPatternObjectInstance;
    }
    public void showMessage(){
        System.out.println("Hello,this is from the class of SingletonPatternObject!");
    }
}
