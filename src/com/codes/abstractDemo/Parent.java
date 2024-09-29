package com.codes.abstractDemo;

// abstract class doesn't support multiple inheritance
public abstract class Parent {

    static int a;
    int age;
    final int score; // final class can't be inherited but final variables are inherited by subclass

    public Parent(int age) {
        this.age = age;
        score = age;
    }

    static void hello() {
        System.out.println("Hey");
    }

    void normal() {
        System.out.println("This is Normal Method.");
    }

    // there are no mandatory rules for abstract class has abstract method
    abstract void career();
    abstract void partner ();

    // Not allowed
//    abstract Parent();
}

/*
   In Java, static methods cannot be abstract, and therefore an
   abstract static method cannot exist. This is because abstract
   methods are meant to be overridden by subclasses, but static
   methods belong to the class itself and are not tied to any particular instance.
 */