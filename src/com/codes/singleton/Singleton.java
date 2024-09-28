package com.codes.singleton;
/*
  A Singleton class in Java is a design pattern that restricts
  the instantiation of a class to a single object.
  This ensures that there is only one instance of the class in the entire
  application, and that this single instance can be globally accessed.
 */

public class Singleton {
    int age;

    private Singleton (int age) {
        this.age = age;
        System.out.println("Inside Singleton.");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton(20);
        }
        return instance;
    }
}
