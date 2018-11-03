package com.cit.designpatterns.factory;

/**
 * 工厂方法 （产品类的创建延时到工厂子类）
 */
public interface IPetFactory
{
    public Pet createPet();
}
