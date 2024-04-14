package com.patterns.structural.decorator;

/**
 * 抽象基础装饰
 */
public class DataSourceDecorator implements DataSource{

    private final DataSource wrapper;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrapper = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
