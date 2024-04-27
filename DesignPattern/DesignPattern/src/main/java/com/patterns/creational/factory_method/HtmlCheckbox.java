package com.patterns.creational.factory_method;

public class HtmlCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("paint html checkbox.");
    }
}
