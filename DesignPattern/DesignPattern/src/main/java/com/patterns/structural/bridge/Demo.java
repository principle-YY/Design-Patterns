package com.patterns.structural.bridge;

/**
 * 客户端代码
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
