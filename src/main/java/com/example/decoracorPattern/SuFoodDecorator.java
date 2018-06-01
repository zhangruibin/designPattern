package com.example.decoracorPattern;

/**
 * Created by zhangrui on 2018/6/1.
 */
/*
* @ClassName SuFoodDecorator
*@Description TODO 定义SuFoodDecorator子类,继承FoodDecorator,重写父类的方法进行自我特征的定义
*@Author zhangrui
*@Date 9:32 9:32
*@Version 
* */
public class SuFoodDecorator extends FoodDecorator {
    public SuFoodDecorator(Food decoratorFood) {
        super(decoratorFood);
    }
    //在此类里面对父类的方法进行重写,定义自己的特征
    @Override
    public void make(){
        decoratorFood.make();
        makeSuFood(decoratorFood);
    }
    private void makeSuFood(Food decoratorFood){
        System.out.println("This is a Su Food");
    }
}
