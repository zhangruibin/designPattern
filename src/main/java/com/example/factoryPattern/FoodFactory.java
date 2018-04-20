package com.example.factoryPattern;

/**
 * Created by zhangrui on 2018/4/20.
 */
/*
* @ClassName FoodFactory
*@Description TODO 创建食品工厂生产根据订单要求生产食品
*@Author zhangrui
*@Date 10:41 10:41
*@Version 
* */
public class FoodFactory {
    //工厂有两条生产线
    NoodleProductLine noodleProductLine = new NoodleProductLine();
    DumplingProductLine dumplingProductLine = new DumplingProductLine();
    //声明处理结果msg
    String msg= "";
    //进货商提交订单需求foodType
    public String creatFood(String...foodType){
        //对进货商的需求进行判断
        //如果需要的是
        for (int i = 0;i < foodType.length;i++ ){
            if (foodType[i].equals("noodle")){
                //调用面条生产线生产面条
                msg += noodleProductLine.creat();
            }else if (foodType[i].equals("dumpling")){
                //调用饺子生产线生产饺子
                msg += dumplingProductLine.creat();
            }else {
                //工厂没有对应的生产线,那就没办法调用生产线生产食物,所以返回提示信息
                msg = "订单中的食物"+foodType[i]+"我们厂没办法成产,找别家看看吧";
            }
        }
        //工厂运行确认完毕
        return msg;
    }
}
