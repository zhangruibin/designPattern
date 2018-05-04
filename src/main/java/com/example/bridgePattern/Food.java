package com.example.bridgePattern;

/**
 * Created by zhangrui on 2018/5/4.
 */
/*
* @ClassName Food
*@Description TODO
*@Author zhangrui
*@Date 14:41 14:41
*@Version 
* */
public abstract class Food {
    protected BurdenSheet burdenSheet;

    protected Food(BurdenSheet burdenSheet){
        this.burdenSheet = burdenSheet;
    }

    public abstract void cook();
}
