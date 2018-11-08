package com.cit.designpatterns.facade;

/**
 * 门面
 */
public class Consumer
{
    private OrderService orderService;
    private PayService payService;
    private LogisticsService logisticsService;

    public Consumer()
    {
        orderService = new OrderService();
        payService = new PayService();
        logisticsService = new LogisticsService();
    }

    public void buy(String name)
    {
        System.out.println("客户购买: " + name);
        orderService.order(name);
        payService.pay(name);
        logisticsService.logistics(name);
    }
}
