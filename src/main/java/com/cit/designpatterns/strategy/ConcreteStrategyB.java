package com.cit.designpatterns.strategy;

/**
 * 具体的策略类
 */
public class ConcreteStrategyB implements Strategy
{
    @Override
    public void strategyInterface()
    {
        System.out.println("使用策略B");
    }
}
