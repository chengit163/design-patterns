package com.cit.designpatterns.singleton;

/**
 * 懒汉式 (线程不安全) [不可用] <br>
 * 资源浪费: 否
 */
public class Singleton_2
{

    private static Singleton_2 instance;

    private Singleton_2()
    {
    }

    public static Singleton_2 getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton_2();
        }
        return instance;
    }
}