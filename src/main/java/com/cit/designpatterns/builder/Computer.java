package com.cit.designpatterns.builder;

public class Computer
{
    private String cpu;

    private String screen;

    private String camera;

    private String battery;

    private String os;

    public Computer()
    {
    }

    private Computer(Builder builder)
    {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.battery = builder.battery;
        this.os = builder.os;
    }


    @Override
    public String toString()
    {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", battery='" + battery + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    public static final class Builder
    {
        private String cpu;

        private String screen;

        private String camera;

        private String battery;

        private String os;

        public Builder setCpu(String cpu)
        {
            this.cpu = cpu;
            return this;
        }

        public Builder setScreen(String screen)
        {
            this.screen = screen;
            return this;
        }

        public Builder setCamera(String camera)
        {
            this.camera = camera;
            return this;
        }

        public Builder setBattery(String battery)
        {
            this.battery = battery;
            return this;
        }

        public Builder setOs(String os)
        {
            this.os = os;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }
    }
}
