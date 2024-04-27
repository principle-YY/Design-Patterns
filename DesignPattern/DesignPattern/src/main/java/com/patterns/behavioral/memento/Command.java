package com.patterns.behavioral.memento;

/**
 * 基础命令类
 */
public interface Command {
    String getName();
    void execute();
}
