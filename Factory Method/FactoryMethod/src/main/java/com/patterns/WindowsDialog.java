package com.patterns;

public class WindowsDialog extends Dialog {
    @Override
    public Button createnButton() {
        return new WindowsButton();
    }
}
