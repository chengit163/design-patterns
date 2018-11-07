package com.cit.designpatterns.prototype;

import java.util.Date;

public class Sheep implements Cloneable
{
    public String name;

    public Date birthday;

    public Sheep(String name, Date birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Sheep clone()
    {
        try
        {
            Sheep sheep = (Sheep) super.clone();
            // 深克隆
            sheep.birthday = (Date) sheep.birthday.clone();
            return sheep;
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
