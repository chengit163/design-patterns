package com.cit.designpatterns.facade;

/**
 * 订单子系统
 */
public class OrderService
{
    public void order(String name)
    {
        System.out.println("[" + name + "]已下单");
    }
}
