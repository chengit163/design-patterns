package com.cit.designpatterns.factory;

public class Dog extends Pet
{
    @Override
    public void eat()
    {
        System.out.println("我是宠物狗, 我要吃骨头");
    }
}
