package com.patterns.structural.bridge;

/**
 * 高级远程控制器
 */
public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setChannel(0);
    }
}
