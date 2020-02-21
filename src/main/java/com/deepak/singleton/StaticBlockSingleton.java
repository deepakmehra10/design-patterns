package com.deepak.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;
    
    private StaticBlockSingleton() {
        // No-op
    }
    
    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred in creating singleton instance.");
        }
    }
    
    public static StaticBlockSingleton getInstance() {
        return staticBlockSingleton;
    }
}
