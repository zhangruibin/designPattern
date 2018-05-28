package com.example.filterPattern;

import java.util.ArrayList;
import java.util.List;

/*
* @ClassName MeetBaoziFilter
*@Description TODO
*@Author zhangrui
*@Date 14:33 14:33
*@Version 
* */
public class MeetBaoziFilter implements Filter{
    @Override
    public List<Baozi> eatFilter(List<Baozi> baoziList) {
        List<Baozi> baoziListNew = new ArrayList<Baozi>();
        for (int i = 0;i < baoziList.size();i++){
            if (baoziList.get(i).getType().equalsIgnoreCase("meet")){
                baoziListNew.add(baoziList.get(i));
            }
        }
        return baoziListNew;
    }
}
