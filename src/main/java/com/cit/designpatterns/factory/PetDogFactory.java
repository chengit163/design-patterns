package com.cit.designpatterns.factory;

public class PetDogFactory implements IPetFactory
{
    @Override
    public Pet createPet()
    {
        return new Dog();
    }
}
