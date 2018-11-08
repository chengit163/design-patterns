package com.cit.designpatterns.facade;

/**
 * 支付子系统
 */
public class PayService
{
    public void pay(String name)
    {
        System.out.println("[" + name + "]已支付");
    }
}
