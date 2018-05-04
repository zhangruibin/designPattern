package com.example.bridgePattern;

/*
* @ClassName BridgePatternDemo
*@Description TODO
*@Author zhangrui
*@Date 14:51 14:51
*@Version 
* */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Food meetBaozi = new Baozi("肉","大",new MeetBaozi());
        Food suBaozi = new Baozi("素","小",new MeetBaozi());
        meetBaozi.cook();
        suBaozi.cook();
    }
}
