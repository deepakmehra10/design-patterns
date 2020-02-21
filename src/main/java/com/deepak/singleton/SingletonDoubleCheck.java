package com.deepak.singleton;

public class SingletonDoubleCheck {
    private static SingletonDoubleCheck singletonDoubleCheck;
    
    private SingletonDoubleCheck() {
        // No-op
    }
    
    public static SingletonDoubleCheck getInstance() {
        if (singletonDoubleCheck == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (singletonDoubleCheck == null) {
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
