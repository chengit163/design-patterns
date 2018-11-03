package com.cit.designpatterns.observer;

public class Main
{
    public static void main(String[] args)
    {
        // 创建一个主题
        WeatherData subject = new WeatherData();

        // 创建多个观察者
        Observer observer0 = new WeatherDisplay("observer0");
        subject.attachObserver(observer0);
        Observer observer1 = new WeatherDisplay("observer1");
        subject.attachObserver(observer1);
        Observer observer2 = new WeatherDisplay("observer1");
        subject.attachObserver(observer2);

        System.out.println("----------");
        subject.setMeasurements(30.1F, 50.2F, 70.3F);

        System.out.println("----------");
        subject.detachObserver(observer2);
        subject.setMeasurements(35.1F, 55.2F, 75.3F);
    }
}