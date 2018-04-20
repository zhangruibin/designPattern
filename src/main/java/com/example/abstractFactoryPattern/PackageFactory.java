package com.example.abstractFactoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName PackageFactory
*@Description TODO
*@Author zhangrui
*@Date 15:26 15:26
*@Version 
* */
public class PackageFactory extends AbstractFactory {
    PaperProductLine paperProductLine = new PaperProductLine();
    PlasticProductLine plasticProductLine = new PlasticProductLine();
    @Override
    Food creatFood(String... foodOrder) {
        return null;
    }

    @Override
    Packaging creatPackage(String... packageOrder) {
        if (packageOrder==null){
            return null;
        }
        //对进货商的需求进行判断
        //如果需要的是
        for (int i = 0;i < packageOrder.length;i++ ){
            if (packageOrder[i].equalsIgnoreCase("paper")){
                //调用纸包装生产线生产纸包装
                paperProductLine.givePackage();
            }else if (packageOrder[i].equalsIgnoreCase("plastic")){
                //调用塑料包装生产线生产塑料包装
                 plasticProductLine.givePackage();
            }else {
                //工厂没有对应的生产线,那就没办法调用生产线生产包装,所以返回提示信息
                System.out.println("订单中的包装"+packageOrder[i]+"我们厂没办法成产,找别家看看吧");;
            }
        }
        return null;
    }
}
