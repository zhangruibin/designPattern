package com.example.proxyPattern;

/**
 * Created by zhangrui on 2018/6/4.
 */
/*
* @ClassName ProxyPatternDemo
*@Description TODO 创建测试类,走代理流程,相当于一个人通过智行软件进行网络购票
*@Author zhangrui
*@Date 10:54 10:54
*@Version 
* */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        String[] channelNames = {"web--智行","web--12306","web--支付宝","web--WeChat","real--古城街道火车票代售点"};
        int tempNum = 1;
        for (String channelName:channelNames){
            System.out.println("开始第"+tempNum+"次购票请求:");
            Ticket ticket = new WebProxyTicket(channelName);
            int flag = ticket.buy();
            if(flag == 1){
                System.out.println("从--"+channelName+"--渠道买票成功,state=200.");
            }else {
                System.out.println("从--"+channelName+"--渠道买票失败,state=500.");
            }
            tempNum++;
            System.out.println("------------------------------------------------------");
        }
    }
}
