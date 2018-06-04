package com.example.proxyPattern;

/**
 * Created by zhangrui on 2018/6/4.
 */
/*
* @ClassName ShouPiaoChuangKou
*@Description TODO 创建售票窗口类,实现了票的接口,意味着可以买票
*@Author zhangrui
*@Date 10:43 10:43
*@Version 
* */
public class ShouPiaoChuangKou implements Ticket {
    private String channalName;
    public ShouPiaoChuangKou(String channalName){
        this.channalName = channalName;
        //定义自身具有的方法,经由这个类可以实现网络购票
        this.buyTicketFromWeb(channalName);
    }
    @Override
    public int buy() {
        System.out.println("****票务窗口开始进行出票****");
        return 1;
    }
    public void buyTicketFromWeb(String channalName){
        System.out.println("从--"+channalName+"---电子渠道发来了一个购票请求");
    }
}
