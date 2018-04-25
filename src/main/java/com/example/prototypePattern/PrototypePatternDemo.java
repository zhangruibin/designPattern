package com.example.prototypePattern;

/**
 * Created by zhangrui on 2018/4/25.
 */
/*
* @ClassName PrototypePatternDemo
*@Description TODO
*@Author zhangrui
*@Date 14:04 14:04
*@Version 
* */
public class PrototypePatternDemo  {
    public static void main(String[] args) {
        FoodCatch.addFood();

        Food cloneFood1 = FoodCatch.getFood("1");
        System.out.println("cloneFood1:-----"+cloneFood1.getName());
        Food cloneFood2 = FoodCatch.getFood("2");
        System.out.println("cloneFood2:-----"+cloneFood2.getName());
    }
}
