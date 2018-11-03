package com.cit.designpatterns.observer;

public class WeatherDisplay implements Observer
{
    private String name;

    public WeatherDisplay(String name)
    {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure)
    {
        System.out.println(name + "(" + temperature + ", " + humidity + ", " + pressure + ")");
    }

}