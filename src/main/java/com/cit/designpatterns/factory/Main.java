package com.cit.designpatterns.factory;

public class Main
{
    public static void main(String[] args)
    {
        Pet pet = null;

        System.out.println("----------简单工厂");
        pet = SimpleFactory.createPet("Cat");
        pet.eat();
        pet = SimpleFactory.createPet("Dog");
        pet.eat();

        System.out.println("----------工厂方法");
        IPetFactory petFactory = null;
        petFactory = new PetCatFactory();
        pet = petFactory.createPet();
        pet.eat();
        petFactory = new PetDogFactory();
        pet = petFactory.createPet();
        pet.eat();

        System.out.println("----------抽象工厂");
        AbstractFactory factory = null;
        factory = new CatFactory();
        factory.createFood();
        pet = factory.createPet();
        pet.eat();
        factory = new DogFactory();
        factory.createFood();
        pet = factory.createPet();
        pet.eat();
    }
}
