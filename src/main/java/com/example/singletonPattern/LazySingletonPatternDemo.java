package com.example.singletonPattern;

/**
 * Created by zhangrui on 2018/4/19.
 */
/*
* @ClassName LazySingletonPatternDemo
*@Description TODO 懒汉模式 双锁结构 DCL double check lock
*@Author zhangrui
*@Date 17:19 17:19
*@Version 
* */
public class LazySingletonPatternDemo {
    private static LazySingletonPatternDemo lazySingletonPatternDemoInstance;
    private LazySingletonPatternDemo(){};
    //线程同步
    public static synchronized LazySingletonPatternDemo getInstance(){
        if (lazySingletonPatternDemoInstance==null){
            synchronized (LazySingletonPatternDemo.class){
                lazySingletonPatternDemoInstance = new LazySingletonPatternDemo();
            }
        }
        return lazySingletonPatternDemoInstance;
    }
}
