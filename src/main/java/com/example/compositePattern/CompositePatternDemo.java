package com.example.compositePattern;

/**
 * Created by zhangrui on 2018/5/31.
 */
/*
* @ClassName CompositePatternDemo
*@Description TODO
*@Author zhangrui
*@Date 14:21 14:21
*@Version 
* */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Baozi gouBuLi = new Baozi("狗不理","肉馅",1.5);
        Baozi gouBuLi1 = new Baozi("狗不理1","素馅",3.5);
        Baozi gouBuLi2 = new Baozi("狗不理3","混合",3.0);
        Baozi xiaoLongBao = new Baozi("小笼包","肉馅",1.0);
        Baozi xiaoLongBao1 = new Baozi("小笼包1","肉馅",1.0);
        Baozi sanQuan = new Baozi("三全","素馅",2.5);
        Baozi sanQuan1 = new Baozi("三全1","肉馅",2.0);
        gouBuLi.add(gouBuLi1);
        gouBuLi.add(gouBuLi2);
        gouBuLi1.add(xiaoLongBao);
        gouBuLi1.add(xiaoLongBao1);
        xiaoLongBao.add(sanQuan);
        xiaoLongBao1.add(sanQuan1);
        //打印放进去的包子
        for (Baozi baozi :gouBuLi.getBaoziList()){
            System.out.println(baozi);
            for (Baozi baozi1 :xiaoLongBao.getBaoziList()){
                if (baozi.getBaoziList().size() == 0){
                    if (baozi1.getBaoziList().size() == 0){
                        System.out.println("******这个"+baozi1+"没有内在集合******");
                    }else {
                        System.out.println("内层循环-------"+baozi1+">>>>>");
                    }
                }else {
                    System.out.println("这个包子来自外层循环,没有内置集合:"+baozi);
                }
            }
        }
    }
}
