package com.example.adapterPattern;

/**
 * Created by zhangrui on 2018/5/3.
 */
/*
* @ClassName AviPlayer
*@Description TODO
*@Author zhangrui
*@Date 14:20 14:20
*@Version 
* */
public class AviPlayer implements SuperPlayer {
    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing avi file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
