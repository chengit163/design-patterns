package com.cit.designpatterns.proxy;

public class Main
{
    public static void main(String[] args)
    {
        Server server = null;

        System.out.println("----------静态代理");
        server = new ProxyServer();
        server.surfTheInternet();

        System.out.println("----------动态代理");
        server = (Server) ProxyFactory.getProxyInstance(new HongKongServer());
        server.surfTheInternet();

        System.out.println("----------动态代理Cglib");
        CglibProxyFactory factory = new CglibProxyFactory(new HongKongServer());
        server = (Server) factory.getProxyInstance();
        server.surfTheInternet();
    }
}
