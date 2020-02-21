package com.deepak.singleton;

public class SingletonEager {
    
    private static final SingletonEager singletonEager = new SingletonEager();
    
    private SingletonEager() {
        // No-op
    }
    
    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
