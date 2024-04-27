package com.patterns.creational.singleton;

/**
 * 单例
 */
public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
//        try{
//            Thread.sleep(1000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        //线程不安全写法
//        if (instance == null){
//            instance = new Singleton(value);
//        }
//        return instance;

        //线程安全写法
        Singleton result = instance;
        if (result != null){
            return result;
        }
        synchronized (Singleton.class){
            if (instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }

    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
