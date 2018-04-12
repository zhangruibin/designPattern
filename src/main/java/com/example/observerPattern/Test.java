package com.example.observerPattern;

/**
 * Created by zhangrui on 2018/4/12.
 */
/*
* @ClassName Test
*@Description TODO
*@Author zhangrui
*@Date 9:55 9:55
*@Version 
* */
public class Test {
    public static void main(String[] args) {
        Productor productor = new Productor();
       /* Consumer consumer = new Consumer();*/
        Oberver a1 = new Consumer("食客1");
        Oberver a2 = new Consumer("食客2");
        Oberver a3 = new Consumer("食客3");
        productor.registerObsercer(a1);
        productor.registerObsercer(a2);
        productor.registerObsercer(a3);
        productor.creatProduct("包子");
        System.out.println("----------------------------------------------");
        productor.removeObserver(a3);
        productor.creatProduct("油条");
    }
}
