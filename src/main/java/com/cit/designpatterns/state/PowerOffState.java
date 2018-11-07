package com.cit.designpatterns.state;

public class PowerOffState implements TVState
{
    @Override
    public void prevChannel()
    {
        System.out.println("Please power on");
    }

    @Override
    public void nextChannel()
    {
        System.out.println("Please power on");
    }

    @Override
    public void turnUp()
    {
        System.out.println("Please power on");
    }

    @Override
    public void turnDown()
    {
        System.out.println("Please power on");
    }
}
