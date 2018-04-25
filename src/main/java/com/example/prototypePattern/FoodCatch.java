package com.example.prototypePattern;

import java.util.Hashtable;

/**
 * Created by zhangrui on 2018/4/25.
 */
/*
* @ClassName FoodCatch
*@Description TODO
*@Author zhangrui
*@Date 11:28 11:28
*@Version 
* */
public class FoodCatch {
    //把食物存储到一个HashTable中
    private static Hashtable<String,Food> foodHashtable = new Hashtable<String,Food>();
    //根据食物的ID获取食物
    public static Food getFood(String foodId){
        Food food = foodHashtable.get(foodId);
        //返回一个克隆后的食物
        return (Food) food.clone();
    }
    //添加两种食物
    public static void addFood(){
        Mantou mantou = new Mantou();
        mantou.setId("1");
        //mantou.setName("玉米馒头");
        mantou.creat();
        foodHashtable.put(mantou.getId(),mantou);
        Toufu toufu = new Toufu();
        toufu.setId("2");
        //toufu.setName("黑豆豆腐");
        toufu.creat();
        foodHashtable.put(toufu.getId(),toufu);
    }


}
