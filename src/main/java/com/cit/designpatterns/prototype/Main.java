package com.cit.designpatterns.prototype;

public class Main
{
    public static void main(String[] args)
    {
        Sheep sheep = new Sheep("Dolly");
        System.out.println(sheep.name + "@" + Integer.toHexString(sheep.hashCode()));

        Sheep clone = sheep.clone();
        System.out.println(clone.name + "@" + Integer.toHexString(clone.hashCode()));
    }
}
