package com.cit.designpatterns.state;

public class Main
{
    public static void main(String[] args)
    {
        TVController controller = new TVController();
        controller.prevChannel();
        controller.nextChannel();
        controller.turnUp();
        controller.turnDown();

        controller.powerOn();
        controller.prevChannel();
        controller.nextChannel();
        controller.turnUp();
        controller.turnDown();
    }
}
