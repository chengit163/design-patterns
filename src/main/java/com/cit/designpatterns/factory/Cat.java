package com.cit.designpatterns.factory;

public class Cat extends Pet
{
    @Override
    public void eat()
    {
        System.out.println("我是宠物猫, 我要吃鱼头");
    }
}
