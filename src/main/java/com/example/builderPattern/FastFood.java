package com.example.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName FastFood
*@Description TODO 快餐类 相当于菜单
*@Author zhangrui
*@Date 16:57 16:57
*@Version 
* */
public class FastFood {
    private List<TopFoodItem> topFoodItemList = new ArrayList<TopFoodItem>();
    public void addTopFoodItem(TopFoodItem topFoodItem){
        //向套餐中加入一个食品
        topFoodItemList.add(topFoodItem);
    }
    //获取消费钱数
    public float getCost(){
        float cost = 0.0f;
        for (TopFoodItem foodItem : topFoodItemList) {
            cost += foodItem.price();
        }
        return cost;
    }
    //展示套餐里面的详细信息
    public void showItems(){
        for (TopFoodItem foodItem : topFoodItemList) {
            System.out.print("TopFoodItem : "+foodItem.name());
            System.out.print(", Packing : "+foodItem.packing().pack());
            System.out.println(", Price : "+foodItem.price());
        }
    }
}
