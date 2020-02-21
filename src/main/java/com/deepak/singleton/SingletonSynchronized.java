package com.deepak.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized singletonSynchronized;
    
    private SingletonSynchronized() {
        // No-op
    }
    
    public static synchronized SingletonSynchronized getInstance() {
        if (singletonSynchronized == null) {
            singletonSynchronized = new SingletonSynchronized();
        }
        
        return singletonSynchronized;
    }
}
