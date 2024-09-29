package com.codes.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal(); // for accessing Parent class method
        System.out.println("Daughter normal method");
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man.");
    }
}
