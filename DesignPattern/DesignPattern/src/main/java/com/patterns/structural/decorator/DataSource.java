package com.patterns.structural.decorator;

/**
 * 定义了读取和写入的通用数据接口
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
