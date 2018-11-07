package com.cit.designpatterns.prototype;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Sheep sheep = new Sheep("Dolly", new Date());
        System.out.println(sheep.name + ":" + sheep.birthday + "@" + Integer.toHexString(sheep.hashCode()));
        Sheep clone = sheep.clone();
        clone.birthday.setTime(0);

        System.out.println(sheep.name + ":" + sheep.birthday + "@" + Integer.toHexString(sheep.hashCode()));
        System.out.println(clone.name + ":" + clone.birthday + "@" + Integer.toHexString(clone.hashCode()));
    }
}
