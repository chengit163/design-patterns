package com.cit.designpatterns.templatemethod;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-----coffee-----");
        CaffeineBeverageWithHook coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("-----tea-----");
        CaffeineBeverageWithHook tea = new Tea();
        tea.prepareRecipe();
    }
}
