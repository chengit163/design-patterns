package com.cit.designpatterns.singleton;

/**
 * 懒汉式 (线程不安全, 同步代码块) [不可用] <br>
 * 资源浪费: 否
 */
public class Singleton_4
{

    private static Singleton_4 instance;

    private Singleton_4()
    {
    }

    public static Singleton_4 getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton_4.class)
            {
                instance = new Singleton_4();
            }
        }
        return instance;
    }
}