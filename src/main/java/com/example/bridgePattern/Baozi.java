package com.example.bridgePattern;

/*
* @ClassName Baozi
*@Description TODO
*@Author zhangrui
*@Date 14:45 14:45
*@Version 
* */
public class Baozi extends Food{

    private String type;
    private String size;
    public Baozi(String type,String size,BurdenSheet burdenSheet) {
        super(burdenSheet);
        this.type = type;
        this.size = size;
    }

    public void cook() {
        burdenSheet.cookBaozi(type,size);
    }
}
