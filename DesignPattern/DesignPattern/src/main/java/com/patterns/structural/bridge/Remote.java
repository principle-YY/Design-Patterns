package com.patterns.structural.bridge;

/**
 * 所有远程控制器的通用接口
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
