package com.cit.designpatterns.singleton;

/**
 * 懒汉式 (线程安全, 同步方法) [不推荐用] <br>
 * 资源浪费: 否
 */
public class Singleton_3
{

    private static Singleton_3 instance;

    private Singleton_3()
    {
    }

    public static synchronized Singleton_3 getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton_3();
        }
        return instance;
    }
}