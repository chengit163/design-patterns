package com.cit.designpatterns.observer;

/**
 * 抽象主题（Subject）接口
 */
public interface Subject
{
    public void attachObserver(Observer observer);

    public void detachObserver(Observer observer);

    public void notifyObservers();
}