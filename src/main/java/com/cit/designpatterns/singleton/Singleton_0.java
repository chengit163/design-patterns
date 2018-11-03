package com.cit.designpatterns.singleton;

/**
 * 饿汉式 (线程安全, 静态常量) [可用] <br>
 * 资源浪费: 是
 */
public class Singleton_0
{

    private final static Singleton_0 INSTANCE = new Singleton_0();

    private Singleton_0()
    {
    }

    public static Singleton_0 getInstance()
    {
        return INSTANCE;
    }
}