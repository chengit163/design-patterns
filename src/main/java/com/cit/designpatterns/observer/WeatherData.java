package com.cit.designpatterns.observer;

import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject
{

    public List<Observer> observers;
    private float temperature;// 温度
    private float humidity;// 湿度
    private float pressure;// 气压

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void attachObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}