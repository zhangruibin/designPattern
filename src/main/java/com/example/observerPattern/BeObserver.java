package com.example.observerPattern;

/**
 * Created by zhangrui on 2018/4/11.
 */
/*
* @ClassName BeObserver
*@Description TODO 抽象出来被观察的接口可以类比生产者,消费者观察生产者,一旦生产东西消费者就收取东西
*@Author zhangrui
*@Date 15:42 15:42
*@Version 
* */
public interface BeObserver {
    public void  registerObsercer(Oberver oberver);
    public void  removeObserver(Oberver oberver);
    public void  notifyObserver();

}
