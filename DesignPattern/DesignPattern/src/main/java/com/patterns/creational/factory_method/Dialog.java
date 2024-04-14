package com.patterns.creational.factory_method;

/**
 * 基础创建者
 */
public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createnButton();
        okButton.render();
    }

    public abstract Button createnButton();
}
