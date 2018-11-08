package com.cit.designpatterns.facade;

/**
 * 物流子系统
 */
public class LogisticsService
{
    public void logistics(String name)
    {
        System.out.println("[" + name + "]已发货");
    }
}
