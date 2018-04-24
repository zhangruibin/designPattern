package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName BuilderPatternDemo
*@Description TODO
*@Author zhangrui
*@Date 17:12 17:12
*@Version 
* */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        //类似创建一个厨师
        FastFoodBuilder fastFoodBuilder1 = new FastFoodBuilder();
        //这个厨师做了个套餐一
        FastFood fastFood1 = fastFoodBuilder1.makeSuHamburgerFastFood();
        float cost1 = fastFood1.getCost();
        fastFood1.showItems();
        System.out.println("套餐二消费的金额为:"+cost1);
        System.out.println("以上是快餐套餐一的价格(素)");
        //这个厨师做了个套餐二
        FastFood fastFood2 = fastFoodBuilder1.makeMeetHamburgerFastFood();
        float cost2 = fastFood2.getCost();
        fastFood2.showItems();
        System.out.println("套餐二消费的金额为:"+cost2);
        System.out.println("以上是快餐套餐一的价格(肉)");
    }
}
