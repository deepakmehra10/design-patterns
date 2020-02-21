package com.deepak.singleton;

public class SingletonLazy {
    
    private static SingletonLazy singletonLazy;
    
    private SingletonLazy() {
        // No-op
    }
    
    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
