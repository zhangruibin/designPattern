package com.example.bridgePattern;

/*
* @ClassName Filter
*@Description TODO
*@Author zhangrui
*@Date 14:38 14:38
*@Version 
* */
public class MeetBaozi implements BurdenSheet{
    @Override
    public void cookBaozi(String type, String size) {
        System.out.println("根据配方生产了"+type+"类型的"+size+"包子......");
    }
}
