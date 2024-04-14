package com.patterns.creational.abstract_factory.gui;

/**
 * 第一个产品层次结构
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOS Button.");
    }
}
