package org.dimigo.oop2;

public class Singleton {
//    private static Singleton instance = new Singleton();
    private static Singleton instance;

    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
