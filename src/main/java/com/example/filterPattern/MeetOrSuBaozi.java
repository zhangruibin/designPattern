package com.example.filterPattern;

import java.util.List;

/**
 * Created by zhangrui on 2018/5/28.
 */
/*
* @ClassName MeetOrSuBaozi
*@Description TODO
*@Author zhangrui
*@Date 11:15 11:15
*@Version 
* */
public class MeetOrSuBaozi implements Filter {
    private Filter filter;
    private Filter otherFilter;
    public MeetOrSuBaozi(Filter filter,Filter otherFilter){
        this.filter = filter;
        this.otherFilter = otherFilter;
    }
    @Override
    public List<Baozi> eatFilter(List<Baozi> baoziList) {
        List<Baozi> meetBaozis = filter.eatFilter(baoziList);
        List<Baozi> suBaozis = otherFilter.eatFilter(baoziList);
        for (Baozi baozi :baoziList) {
            //定义,MeetOrSuBaozi过滤掉了肉包子,也可以定义过滤掉素包子,下面注销部分是过滤掉素包子
            if (meetBaozis.contains(baozi)) {
                suBaozis.add(baozi);
            }
        }
        return suBaozis;
       /* for (Baozi baozi :baoziList){
            if (!suBaozis.contains(baozi)){
                meetBaozis.add(baozi);
            }
        }
        return meetBaozis;*/
    }
}
