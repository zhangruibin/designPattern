package com.example.decoracorPattern;

/**
 * Created by zhangrui on 2018/6/1.
 */
/*
* @ClassName FoodDecorator
*@Description TODO 建立抽象类,实现顶级接口,定义自己特有的属性
*@Author zhangrui
*@Date 9:27 9:27
*@Version 
* */
public abstract class FoodDecorator implements Food{
    protected Food decoratorFood;
    public FoodDecorator(Food decoratorFood){
        this.decoratorFood = decoratorFood;
    }
    public void make(){
        decoratorFood.make();
    }
}
