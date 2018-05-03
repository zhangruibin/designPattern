package com.example.adapterPattern;

/**
 * Created by zhangrui on 2018/5/3.
 */
/*
* @ClassName Mp4Player
*@Description TODO
*@Author zhangrui
*@Date 14:22 14:22
*@Version 
* */
public class Mp4Player implements SuperPlayer {
    @Override
    public void playAvi(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name: "+ fileName);
    }
}
