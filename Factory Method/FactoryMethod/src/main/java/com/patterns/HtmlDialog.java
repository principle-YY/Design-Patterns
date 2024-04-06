package com.patterns;

public class HtmlDialog extends Dialog {

    @Override
    public Button createnButton() {
        return new HtmlButton();
    }
}
