package com.example.abstractFactoryPattern;



/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName FoodFactory
*@Description TODO
*@Author zhangrui
*@Date 15:25 15:25
*@Version 
* */
public class FoodFactory extends AbstractFactory {
    NoodleProductLine noodleProductLine = new NoodleProductLine();
    DumplingProductLine dumplingProductLine = new DumplingProductLine();
    @Override
    Food creatFood(String... foodOrder) {
        if (foodOrder==null){
            return null;
        }
        String msg = "";
        //对进货商的需求进行判断
        //如果需要的是
        for (int i = 0;i < foodOrder.length;i++ ){
            if (foodOrder[i].equals("noodle")){
                //调用面条生产线生产面条
                noodleProductLine.creat();
               // return noodleProductLine;
            }else if (foodOrder[i].equals("dumpling")){
                //调用饺子生产线生产饺子
                dumplingProductLine.creat();
               //return dumplingProductLine;
            }else {
                //工厂没有对应的生产线,那就没办法调用生产线生产食物,所以返回提示信息
                System.out.println("订单中的食物"+foodOrder[i]+"我们厂没办法成产,找别家看看吧");
            }
        }
        return null;
    }

    @Override
    Packaging creatPackage(String... packageOrder) {
        return null;
    }
}
