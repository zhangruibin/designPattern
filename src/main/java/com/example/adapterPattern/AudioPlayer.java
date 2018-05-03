package com.example.adapterPattern;

/**
 * Created by zhangrui on 2018/5/3.
 */
/*
* @ClassName AudioPlayer
*@Description TODO
*@Author zhangrui
*@Date 14:29 14:29
*@Version 
* */
public class AudioPlayer implements MP3Player {
    PlayerAdapter playerAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("avi")
                || audioType.equalsIgnoreCase("mp4")){
            playerAdapter = new PlayerAdapter(audioType);
            playerAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
