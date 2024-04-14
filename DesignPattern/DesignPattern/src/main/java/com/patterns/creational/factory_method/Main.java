package com.patterns.creational.factory_method;

/**
 * 客户端代码
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        String osName = System.getProperty("os.name");
        if (osName.equals("Windows 10") || osName.equals("Mac OS X")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}