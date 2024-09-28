package com.codes.properties.polymorphism;

public class Numbers {

    // Method Overloading
    void sum (double a, int b) {
        System.out.println(a + b);
    }

    void sum (int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.sum(1, 2);
        numbers.sum(1, 2, 3);
    }
}
