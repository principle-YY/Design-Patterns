package com.patterns.creational.abstract_factory.gui;

/**
 * 抽象工厂
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createdCheckbox();
}
