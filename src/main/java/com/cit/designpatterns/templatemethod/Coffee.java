package com.cit.designpatterns.templatemethod;

public class Coffee extends CaffeineBeverageWithHook
{
    private final boolean customerWantsCondiments = true;

    @Override
    void brew()
    {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments()
    {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments()
    {
        return customerWantsCondiments;
    }
}