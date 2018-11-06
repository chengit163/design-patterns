package com.cit.designpatterns.prototype;

public class Sheep implements Cloneable
{
    public String name;

    public Sheep(String name)
    {
        this.name = name;
    }

    @Override
    public Sheep clone()
    {
        try
        {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
