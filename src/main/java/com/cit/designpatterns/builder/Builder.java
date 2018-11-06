package com.cit.designpatterns.builder;

/**
 * 抽象Builder类
 */
public abstract class Builder
{
    public abstract void buildCpu(String cpu);

    public abstract void builderScreen(String screen);

    public abstract void buildCamera(String camera);

    public abstract void buildBattery(String battery);

    public abstract void buildOs(String os);

    public abstract Phone build();
}
