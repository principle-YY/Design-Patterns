package com.patterns.behavioral.visitor;

/**
 * 通用访问接口
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitorRectangle(Rectangle rectangle);

    String visitorCompound(CompoundShape cg);
}
