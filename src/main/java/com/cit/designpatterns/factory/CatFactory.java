package com.cit.designpatterns.factory;

public class CatFactory extends AbstractFactory
{
    @Override
    public Pet createPet()
    {
        return new Cat();
    }

    @Override
    public Food createFood()
    {
        return new CatFood();
    }
}
