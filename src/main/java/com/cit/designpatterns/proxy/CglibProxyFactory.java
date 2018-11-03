package com.cit.designpatterns.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor
{
    private Object target;

    public CglibProxyFactory(Object target)
    {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("CglibProxyFactory代理In");
        Object result = method.invoke(target, objects);
        System.out.println("CglibProxyFactory代理Out, 结果: " + result);
        return result;
    }

    public Object getProxyInstance()
    {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }
}
