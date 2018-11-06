package com.cit.designpatterns.builder;

public class Main
{
    public static void main(String[] args)
    {
        // 1
        Builder builder = new HuaweiBuilder();
        builder.buildCpu("麒麟四核");
        builder.builderScreen("1920*720");
        builder.buildCamera("莱卡");
        builder.buildBattery("5000mAh");
        builder.buildOs("Android");
        Phone phone = builder.build();
        System.out.println(phone);


        // 2
        Computer computer = new Computer.Builder()
                .setCpu("酷睿i5").setScreen("14寸").setCamera("500万像素").setBattery("续航5小时").setOs("Windows").build();
        System.out.println(computer);
    }
}
