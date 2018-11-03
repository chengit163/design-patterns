package com.cit.designpatterns.proxy;

public class ProxyServer implements Server
{
    private Server server;

    public ProxyServer()
    {
        server = new HongKongServer();
    }

    @Override
    public void surfTheInternet()
    {
        System.out.println("我是代理服务器");
        server.surfTheInternet();
    }
}
