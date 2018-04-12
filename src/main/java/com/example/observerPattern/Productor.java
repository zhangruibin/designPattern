package com.example.observerPattern;

import javafx.geometry.VPos;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zhangrui on 2018/4/11.
 */
/*
* @ClassName Productor
*@Description TODO
*@Author zhangrui
*@Date 17:46 17:46
*@Version 
* */
public class Productor implements BeObserver {

    private List<Oberver> list;
    private Object food;

    public Productor(){
        list = new ArrayList<Oberver>();
    }


    @Override
    public void registerObsercer(Oberver oberver) {
        list.add(oberver);

    }

    @Override
    public void removeObserver(Oberver oberver) {
        if (!list.isEmpty()){
            list.remove(oberver);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Oberver observer = list.get(i);
            observer.update(food);
        }
    }
    public void creatProduct(Object food){
        this.food = food;
        System.out.println("生产者生产： " + food);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
