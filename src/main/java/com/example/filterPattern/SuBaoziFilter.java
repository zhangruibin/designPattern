package com.example.filterPattern;

import java.util.ArrayList;
import java.util.List;

/*
* @ClassName SuBaoziFilter
*@Description TODO
*@Author zhangrui
*@Date 14:43 14:43
*@Version 
* */
public class SuBaoziFilter implements Filter{

    @Override
    public List<Baozi> eatFilter(List<Baozi> baoziList) {
        List<Baozi> baoziListNew = new ArrayList<Baozi>();
        for (int i = 0;i < baoziList.size();i++){
            if (baoziList.get(i).getType().equalsIgnoreCase("su")){
                baoziListNew.add(baoziList.get(i));
            }
        }
        return baoziListNew;
    }
}
