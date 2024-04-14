package com.patterns.creational.factory_method;

/**
 * 另一个具体创建者
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createnButton() {
        return new WindowsButton();
    }
}
