package com.patterns.creational.abstract_factory.gui;

/**
 * 具体工厂(macOS)
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createdCheckbox() {
        return new MacOSCheckbox();
    }
}
