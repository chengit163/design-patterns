package com.cit.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory
{

    private static final class ProxyHandler implements InvocationHandler
    {
        private Object target;

        public Object bind(Object target)
        {
            this.target = target;
            return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
        {
            System.out.println("ProxyFactory代理In");
            Object result = method.invoke(target, args);
            System.out.println("ProxyFactory代理Out, 结果: " + result);
            return result;
        }
    }


    public static Object getProxyInstance(Object target)
    {
        return new ProxyHandler().bind(target);
    }
}