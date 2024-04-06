package com.patterns.gui;

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
