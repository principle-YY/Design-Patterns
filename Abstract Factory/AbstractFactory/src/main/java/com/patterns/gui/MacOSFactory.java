package com.patterns.gui;

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
