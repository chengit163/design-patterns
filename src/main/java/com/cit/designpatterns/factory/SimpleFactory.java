package com.cit.designpatterns.factory;

/**
 * Factory：工厂角色
 */
public class SimpleFactory
{
    public static Pet createPet(String type)
    {
        Pet pet = null;
        if (type != null)
        {
            switch (type)
            {
                case "Cat":
                    pet = new Cat();
                    break;
                case "Dog":
                    pet = new Dog();
                    break;
            }
        }
        return pet;
    }
}