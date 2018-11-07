package com.cit.designpatterns.state;

/**
 * 上下文环境，持有 State 记录当前状态
 */
public class TVController implements TVState
{
    private TVState state;

    public TVController()
    {
        state = new PowerOffState();
    }

    public void powerOff()
    {
        state = new PowerOffState();
    }

    public void powerOn()
    {
        state = new PowerOnState();
    }

    @Override
    public void prevChannel()
    {
        state.prevChannel();
    }

    @Override
    public void nextChannel()
    {
        state.nextChannel();
    }

    @Override
    public void turnUp()
    {
        state.turnUp();
    }

    @Override
    public void turnDown()
    {
        state.turnDown();
    }
}
