package com.cit.designpatterns.state;

/**
 * 抽象状态类
 */
public interface TVState
{
    /**
     * 上一频道
     */
    void prevChannel();

    /**
     * 下一频道
     */
    void nextChannel();

    /**
     * 增大音量
     */
    void turnUp();

    /**
     * 减小音量
     */
    void turnDown();
}
