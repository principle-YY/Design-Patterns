package com.patterns.gui;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createdCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
