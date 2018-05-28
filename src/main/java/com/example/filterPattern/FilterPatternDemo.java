package com.example.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangrui on 2018/5/28.
 */
/*
* @ClassName FilterPatternDemo
*@Description TODO
*@Author zhangrui
*@Date 13:57 13:57
*@Version 
* */
public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Baozi> baoziList = new ArrayList<Baozi>();
        baoziList.add(new Baozi("三全","meet","大"));
        baoziList.add(new Baozi("狗不理","meet","大"));
        baoziList.add(new Baozi("庆丰",   "su","小"));
        baoziList.add(new Baozi("猫不闻","su","小"));
        baoziList.add(new Baozi("小笼包","meet","大"));

        Filter meetBaozi = new MeetBaoziFilter();
        Filter suBaozi = new SuBaoziFilter();
        Filter meetAndSuBaozi = new MeetAndSuBaozi(meetBaozi,suBaozi);
        Filter meetOrSuBaozi = new MeetOrSuBaozi(meetAndSuBaozi,suBaozi);
        //经过过滤器的过滤去除了集合里面的素包子
        System.out.println("Meet: ");
        printBaozis(meetBaozi.eatFilter(baoziList));
        //经过过滤器过滤掉了集合里面的肉包子
        System.out.println("\nSu: ");
        printBaozis(suBaozi.eatFilter(baoziList));
        //经过过滤器保留素肉混合,但是没有这样的所以问空
        System.out.println("\nMeet And Su: ");
        printBaozis(meetAndSuBaozi.eatFilter(baoziList));
        //打印素的或者肉的
        System.out.println("\nMeet Or Su: ");
        printBaozis(meetOrSuBaozi.eatFilter(baoziList));
    }
    public static void printBaozis(List<Baozi> baoziList){
        for (Baozi baozi : baoziList) {
            System.out.println("Baozi : [ Name : " + baozi.getName()
                    +", Type : " + baozi.getType()
                    +", Size : " + baozi.getSize()
                    +" ]");
        }
    }
}
