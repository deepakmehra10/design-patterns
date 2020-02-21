package com.deepak.singleton;

import java.lang.reflect.Constructor;

public class SingletonDriver {
    public static void main(String[] args) throws Exception {
        // Singleton Eager
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println("First " + singletonEager.hashCode());
        System.out.println("Second " + singletonEager1.hashCode());
        
        // Singleton Lazy
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println("First " + singletonLazy.hashCode());
        System.out.println("Second " + singletonLazy1.hashCode());
        
        // Singleton Static Block
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        System.out.println("First " + staticBlockSingleton.hashCode());
        System.out.println("Second " + staticBlockSingleton1.hashCode());
        
        // Synchronized Singleton
        SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
        System.out.println("First " + singletonSynchronized.hashCode());
        System.out.println("Second " + singletonSynchronized1.hashCode());
        
        
        // Double Checking Singleton
        SingletonDoubleCheck singletonDoubleCheck = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singletonDoubleCheck1 = SingletonDoubleCheck.getInstance();
        System.out.println("First " + singletonDoubleCheck.hashCode());
        System.out.println("Second " + singletonDoubleCheck1.hashCode());
        
        // Break Singleton Pattern
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println("Singleton Lazy " + singletonLazy2.hashCode());
        
        Constructor<SingletonLazy> constructorSingletonLazy = SingletonLazy.class
                .getDeclaredConstructor();
        constructorSingletonLazy.setAccessible(true);
        SingletonLazy singletonLazy3 = constructorSingletonLazy.newInstance();
        System.out.println("Singleton Lazy with Reflection " + singletonLazy3.hashCode());
        
        // Enum Singleton
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        System.out.println("First " + singletonEnum.hashCode());
        System.out.println("Second " + singletonEnum1.hashCode());
        
        
    }
}
