package com.example.adapterPattern;

/**
 * Created by zhangrui on 2018/5/3.
 */
/*
* @ClassName PlayerAdapter
*@Description TODO
*@Author zhangrui
*@Date 14:23 14:23
*@Version 
* */
public class PlayerAdapter implements MP3Player{
    SuperPlayer superPlayer;
    public PlayerAdapter(String audioType){
        if(audioType.equalsIgnoreCase("avi") ){
            superPlayer = new AviPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            superPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("avi") ){
            superPlayer.playAvi(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")){
            superPlayer.playMp4(fileName);
        }
    }
}
