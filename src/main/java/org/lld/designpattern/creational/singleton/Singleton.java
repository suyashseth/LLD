package org.lld.designpattern.creational.singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("");
        }
        System.out.println("Object Initialized");
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}

