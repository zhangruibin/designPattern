package com.example.adapterPattern;

/**
 * Created by zhangrui on 2018/5/3.
 */
/*
* @ClassName AdapterPatternDemo
*@Description TODO
*@Author zhangrui
*@Date 16:27 16:27
*@Version 
* */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Take me to your heart");
        audioPlayer.play("mp4","Flash man");
        audioPlayer.play("avi","The security of teacher");
        audioPlayer.play("mp4","Hero");
    }
}
