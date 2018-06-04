package com.example.proxyPattern;

/**
 * Created by zhangrui on 2018/6/4.
 */
/*
* @ClassName WebProxyTicket
*@Description TODO 网络购票软件,也实现票务接口,具有购票资质
*@Author zhangrui
*@Date 10:50 10:50
*@Version 
* */
public class WebProxyTicket implements Ticket{
    public ShouPiaoChuangKou shouPiaoChuangKou;
    public String channelName;
    public WebProxyTicket(String channelName){
        this.channelName = channelName;
    }

    @Override
    public int buy() {
        //售票软件发送请求到售票处,进行购票
        if(channelName.startsWith("web")){
            shouPiaoChuangKou = new ShouPiaoChuangKou(channelName);
            shouPiaoChuangKou.buy();
            return 1;
        }else {
            channelName = "其他网络渠道";
            return 0;
        }


    }
}
