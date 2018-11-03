package com.cit.designpatterns.factory;

public class PetCatFactory implements IPetFactory
{
    @Override
    public Pet createPet()
    {
        return new Cat();
    }
}
