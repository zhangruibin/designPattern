package com.example.builderPattern;

/*/**
* @author zhangrui
* @Description 顶级接口,次级类继承此接口组成集合体
* @Date 16:32 2018/4/24
* @Param 
* @returu 
**/
public interface TopFoodItem {
    public String name();
    public Packing packing();
    public double price();
}
