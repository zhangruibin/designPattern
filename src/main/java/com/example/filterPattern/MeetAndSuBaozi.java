package com.example.filterPattern;

import java.util.List;

/**
 * Created by zhangrui on 2018/5/28.
 */
/*
* @ClassName MeetAndSuBaozi
*@Description TODO
*@Author zhangrui
*@Date 11:05 11:05
*@Version 
* */
public class MeetAndSuBaozi implements Filter {
    private Filter filter;
    private Filter otherFilter;

    public MeetAndSuBaozi(Filter filter,Filter otherFilter){
        this.filter = filter;
        this.otherFilter = otherFilter;
    }
    @Override
    public List<Baozi> eatFilter(List<Baozi> baoziList) {
        List<Baozi> baoziList1 = filter.eatFilter(baoziList);
        return otherFilter.eatFilter(baoziList1);
    }
}
