package com.cit.designpatterns.singleton;

/**
 * 双重检查 (线程安全) [推荐用] <br>
 * 资源浪费: 否
 */
public class Singleton_5
{

    private static volatile Singleton_5 instance;

    private Singleton_5()
    {
    }

    public static Singleton_5 getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton_5.class)
            {
                if (instance == null)
                {
                    instance = new Singleton_5();
                }
            }
        }
        return instance;
    }
}