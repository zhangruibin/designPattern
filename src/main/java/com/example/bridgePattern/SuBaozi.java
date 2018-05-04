package com.example.bridgePattern;

/*
* @ClassName SuBaozi
*@Description TODO
*@Author zhangrui
*@Date 14:40 14:40
*@Version 
* */
public class SuBaozi implements BurdenSheet{
    @Override
    public void cookBaozi(String type, String size) {
        System.out.println("根据配方生产了"+type+"类型的"+size+"包子......");
    }
}
