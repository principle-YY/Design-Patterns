package com.patterns.behavioral.iterator;

/**
 * 定义档案接口
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();

}
