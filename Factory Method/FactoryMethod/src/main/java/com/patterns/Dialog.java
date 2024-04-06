package com.patterns;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createnButton();
        okButton.render();
    }

    public abstract Button createnButton();
}
