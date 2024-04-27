package com.patterns.structural.composite;

import java.awt.*;

/**
 * 通用形状接口
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelect();
    void paint(Graphics graphics);
}
