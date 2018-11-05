package com.cit.designpatterns.adapter;

/**
 * Adapter(适配器类)：它可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配。
 */
public class Adapter extends Adaptee implements Target
{
    @Override
    public void targetMethod()
    {
        System.out.println("适配器");
        adapteeMethod();
    }
}
