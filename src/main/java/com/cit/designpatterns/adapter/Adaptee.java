package com.cit.designpatterns.adapter;

/**
 * Adaptee(适配者类)：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类包好了客户希望的业务方法。
 */
public class Adaptee
{
    public void adapteeMethod()
    {
        System.out.println("适配者类执行adapteeMethod");
    }
}
