package com.cit.designpatterns.factory;

/**
 * 抽象工厂
 * 不只一个产品（宠物，食物）
 */
public abstract class AbstractFactory
{
    public abstract Pet createPet();

    public abstract Food createFood();
}
