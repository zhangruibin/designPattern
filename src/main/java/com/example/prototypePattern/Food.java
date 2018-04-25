package com.example.prototypePattern;

/**
 * Created by zhangrui on 2018/4/25.
 */
/*
* @ClassName Food
*@Description TODO
*@Author zhangrui
*@Date 11:15 11:15
*@Version 
* */
public abstract class Food implements Cloneable{
    private String id;
    protected String name;
    protected String test;
    abstract void creat();

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
