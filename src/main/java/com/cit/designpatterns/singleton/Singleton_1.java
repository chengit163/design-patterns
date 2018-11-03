package com.cit.designpatterns.singleton;

/**
 * 饿汉式 (线程安全, 静态代码块) [可用] <br>
 * 资源浪费: 是
 */
public class Singleton_1
{

    private static Singleton_1 instance;

    static
    {
        instance = new Singleton_1();
    }

    private Singleton_1()
    {
    }

    public static Singleton_1 getInstance()
    {
        return instance;
    }
}