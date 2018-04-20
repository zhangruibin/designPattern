package com.example.abstractFactoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName FactoryProducer
*@Description TODO
*@Author zhangrui
*@Date 15:40 15:40
*@Version 
* */
public class FactoryProducer {
    public static AbstractFactory getFactory(String... choice){
        for (int i = 0;i< choice.length;i++){
            if(choice[i].equalsIgnoreCase("food")){
                return new FoodFactory();
            } else if(choice[i].equalsIgnoreCase("package")){
                return new PackageFactory();
            }
        }
        return null;
    }
}
