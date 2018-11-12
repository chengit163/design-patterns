package com.cit.designpatterns.templatemethod;

public class Tea extends CaffeineBeverageWithHook
{
    private final boolean customerWantsCondiments = false;

    @Override
    void brew()
    {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments()
    {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantsCondiments()
    {
        return customerWantsCondiments;
    }
}