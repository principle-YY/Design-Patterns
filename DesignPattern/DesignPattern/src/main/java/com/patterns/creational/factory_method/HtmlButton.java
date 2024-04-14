package com.patterns.creational.factory_method;

/**
 * 具体产品
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Text Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says = 'Hello World!'");
    }
}
