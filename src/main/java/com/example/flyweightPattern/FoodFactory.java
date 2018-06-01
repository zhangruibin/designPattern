package com.example.flyweightPattern;

import java.util.HashMap;

/**
 * Created by zhangrui on 2018/6/1.
 */
/*
* @ClassName FoodFactory
*@Description TODO
*@Author zhangrui
*@Date 14:55 14:55
*@Version 
* */
public class FoodFactory {
    //核心步骤,声明一个私有Map对对象进行存储
    private static  HashMap<String,Baozi> baoziMap = new HashMap<>();

    public static Food getBaozi(String baoziName){
        if (baoziName.equalsIgnoreCase("goubuli")){
            baoziMap.put("goubuli",new Baozi("goubuli","big","su",11.11));
        }
            //根据包子的名字对包子对象进行获取
            Baozi baozi = baoziMap.get(baoziName);
            //对对象进行判断,判断集合里面是否存储了这个名字的包子,如果没有的话就新建一个包子对象进行数据的填充
            if (baozi == null){
                baozi = new Baozi(baoziName);
                System.out.println("集合中没有存储这样的包子,新建了一个包子:>>>>"+baozi);
            }else {
                System.out.println("集合中存储了这个名字的包子,这个包子是:>>>>"+baozi);
            }
            return baozi;
    }
}
