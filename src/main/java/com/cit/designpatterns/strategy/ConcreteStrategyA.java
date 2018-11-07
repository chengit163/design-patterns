package com.cit.designpatterns.strategy;

/**
 * 具体的策略类
 */
public class ConcreteStrategyA implements Strategy
{
    @Override
    public void strategyInterface()
    {
        System.out.println("使用策略A");
    }
}
