package com.patterns.creational.factory_method;

/**
 * 具体创建者
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createnButton() {
        return new HtmlButton();
    }

    @Override
    public Checkbox createnCheckbox() {
        return new HtmlCheckbox();
    }
}
