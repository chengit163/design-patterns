package com.cit.designpatterns.strategy;

/**
 * 上下文环境，持有 Stragegy 配置当前策略
 */
public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    /**
     * 执行策略方法
     */
    public void contextInterface()
    {
        strategy.strategyInterface();
    }
}
