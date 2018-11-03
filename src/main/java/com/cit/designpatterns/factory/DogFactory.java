package com.cit.designpatterns.factory;

public class DogFactory extends AbstractFactory
{
    @Override
    public Pet createPet()
    {
        return new Dog();
    }

    @Override
    public Food createFood()
    {
        return new DogFood();
    }
}
