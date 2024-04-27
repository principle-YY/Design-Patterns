package com.patterns.creational.factory_method;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("paint windows checkbox.");
    }
}
