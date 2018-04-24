package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName FastFoodBuilder
*@Description TODO 制定两个不同的套餐,素套餐和肉套餐
*@Author zhangrui
*@Date 17:07 17:07
*@Version 
* */
public class FastFoodBuilder {
    //套餐一,素汉堡加雪碧
    public FastFood makeSuHamburgerFastFood(){
        FastFood fastFood1 = new FastFood();
        fastFood1.addTopFoodItem(new SuHamburger());
        fastFood1.addTopFoodItem(new Sprite());
        return fastFood1;
    }
    //套餐二,肉汉堡加可口可乐
    public FastFood makeMeetHamburgerFastFood(){
        FastFood fastFood2 = new FastFood();
        fastFood2.addTopFoodItem(new MeetHamburger());
        fastFood2.addTopFoodItem(new CocaCola());
        return fastFood2;
    }
}
