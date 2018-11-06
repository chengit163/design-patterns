package com.cit.designpatterns.builder;

/**
 * 抽象Product类
 */
public abstract class Phone
{
    protected String cpu;

    protected String screen;

    protected String camera;

    protected String battery;

    protected String os;

    public String getCpu()
    {
        return cpu;
    }

    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    public String getScreen()
    {
        return screen;
    }

    public void setScreen(String screen)
    {
        this.screen = screen;
    }

    public String getCamera()
    {
        return camera;
    }

    public void setCamera(String camera)
    {
        this.camera = camera;
    }

    public String getBattery()
    {
        return battery;
    }

    public void setBattery(String battery)
    {
        this.battery = battery;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    @Override
    public String toString()
    {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", battery='" + battery + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
