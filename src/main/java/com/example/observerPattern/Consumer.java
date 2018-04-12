package com.example.observerPattern;

import java.util.List;
import java.util.Observer;

/**
 * Created by zhangrui on 2018/4/11.
 */
/*
* @ClassName Consumer
*@Description TODO
*@Author zhangrui
*@Date 17:48 17:48
*@Version 
* */
public class Consumer implements Oberver{
    private String name;
    private Object food;

    public Consumer(String name){
        this.name = name;
    }
    @Override
    public void update(Object food) {
        this.food = food;
        eat();
    }
    public void eat(){
        System.out.println(name + " 吃到了这个 " + food);
    }
}
