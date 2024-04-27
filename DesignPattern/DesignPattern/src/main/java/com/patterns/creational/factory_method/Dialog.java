package com.patterns.creational.factory_method;

/**
 * 基础创建者
 */
public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createnButton();
        Checkbox checkbox = createnCheckbox();
        okButton.render();
        checkbox.paint();
    }

    public abstract Button createnButton();

    public abstract Checkbox createnCheckbox();
}
