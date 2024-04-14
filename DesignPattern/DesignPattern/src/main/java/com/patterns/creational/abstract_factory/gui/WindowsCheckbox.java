package com.patterns.creational.abstract_factory.gui;

/**
 * 第二个产品层次结构
 */
public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created Windows Checkbox.");
    }
}
