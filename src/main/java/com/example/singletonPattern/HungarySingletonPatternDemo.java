package com.example.singletonPattern;

/**
 * Created by zhangrui on 2018/4/19.
 */
/*
* @ClassName HungarySingletonPatternDemo
*@Description TODO 饿汉模式
*@Author zhangrui
*@Date 18:04 18:04
*@Version 
* */
public class HungarySingletonPatternDemo {
    private static HungarySingletonPatternDemo hungarySingletonPatternDemoInstence;
    private HungarySingletonPatternDemo(){}
    private HungarySingletonPatternDemo getHungarySingletonPatternDemoInstence(){
        return hungarySingletonPatternDemoInstence;
    }
}
