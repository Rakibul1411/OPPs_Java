package com.codes.interfaces.extendDemo2;

public interface A {

    // Static interface methods should always have a body
    // call via the interface name
    static void greeting() {
        System.out.println("Hello World..");
    }

    default void fun() {
        System.out.println("I am in fun2");
    }
}
