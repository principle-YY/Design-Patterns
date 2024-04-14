package com.patterns.structural.decorator;

/**
 * 客户端代码
 */
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\\nJohn Smith,100000\\nSteven Jobs\\nSky,912000";
        DataSourceDecorator encode = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("src/main/resources/OutputDemo.txt")));
        encode.writeData(salaryRecords);

        DataSource plain = new FileDataSource("src/main/resources/OutputDemo.txt");

        System.out.println("- Input ------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded ----------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ----------------");
        System.out.println(encode.readData());
    }
}
