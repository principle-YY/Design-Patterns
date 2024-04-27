package com.patterns.behavioral.visitor;


/**
 * 通用形状接口
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
