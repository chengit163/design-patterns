package com.cit.designpatterns.singleton;

/**
 * 静态内部类 (线程安全) [推荐用] <br>
 * 资源浪费: 否
 */
public class Singleton_6
{

    private Singleton_6()
    {
    }

    private static class SingletonInstance
    {
        private static final Singleton_6 INSTANCE = new Singleton_6();
    }

    public static Singleton_6 getInstance()
    {
        return SingletonInstance.INSTANCE;
    }
}