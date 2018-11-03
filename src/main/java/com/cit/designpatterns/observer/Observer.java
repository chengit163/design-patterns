package com.cit.designpatterns.observer;

/**
 * 抽象观察者（Observer）接口
 */
public interface Observer
{
    public void update(float temp, float humidity, float pressure);
}