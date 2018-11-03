package com.cit.designpatterns.proxy;

public class HongKongServer implements Server
{
    @Override
    public void surfTheInternet()
    {
        System.out.println("我是香港服务器，正在网上冲浪...");
    }
}
