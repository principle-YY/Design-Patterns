package com.patterns.creational.prototype;

/**
 * 简单形状
 */
public class Circle extends Shape{
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle circle) || !super.equals(obj)) return false;
        return circle.radius == radius;
    }
}
