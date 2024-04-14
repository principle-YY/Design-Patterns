package com.patterns.creational.abstract_factory.gui;

/**
 * 具体工厂(Windows)
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createdCheckbox() {
        return new WindowsCheckbox();
    }
}
