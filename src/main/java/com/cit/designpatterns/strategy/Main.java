package com.cit.designpatterns.strategy;

public class Main
{
    public static void main(String[] args)
    {
        Context context = null;

        Strategy strategyA = new ConcreteStrategyA();
        context = new Context(strategyA);
        context.contextInterface();

        Strategy strategyB = new ConcreteStrategyB();
        context = new Context(strategyB);
        context.contextInterface();

        Strategy strategyC = new ConcreteStrategyC();
        context = new Context(strategyC);
        context.contextInterface();
    }
}
