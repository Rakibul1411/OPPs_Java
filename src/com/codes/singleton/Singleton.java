package com.codes.singleton;
/*
  A Singleton class in Java is a design pattern that restricts
  the instantiation of a class to a single object.
  This ensures that there is only one instance of the class in the entire
  application, and that this single instance can be globally accessed.
 */

import com.codes.access.A;
import com.codes.access.SubClass;

import java.util.ArrayList;
import java.util.Collections;


public class Singleton extends A {
    int age;

    private Singleton (int age) {
        super(3, "Rony");
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

    public static void main(String[] args) {

        A obj = new A(45, "Rony");
    }
}

class SubSubClass2 extends SubClass {

    public SubSubClass2(int num, String name) {
        super(num, name);
    }
}