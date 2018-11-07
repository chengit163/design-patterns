package com.cit.designpatterns.singleton;

public class Main
{
    private static class T implements Runnable{
        @Override
        public void run()
        {
            Singleton_2 instance = Singleton_2.getInstance();
            System.out.println(Thread.currentThread().getName() + "#" + instance);
        }
    }

    public static void main(String[] args)
    {
        Thread t0 = new Thread(new T());
        Thread t1 = new Thread(new T());
        t0.start();
        t1.start();
    }
}
