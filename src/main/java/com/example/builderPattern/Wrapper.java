package com.example.builderPattern;

/**
 * Created by zhangrui on 2018/4/24.
 */
/*
* @ClassName Wrapper
*@Description TODO 纸包装类,继承了包装接口
*@Author zhangrui
*@Date 16:46 16:46
*@Version 
* */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper---->纸包装";
    }
}
