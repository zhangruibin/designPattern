package com.example.abstractFactoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName PaperProductLine
*@Description TODO
*@Author zhangrui
*@Date 15:16 15:16
*@Version 
* */
public class PaperProductLine implements Packaging {
    @Override
    public void givePackage() {
        System.out.println( "生产纸包装");
    }
}
