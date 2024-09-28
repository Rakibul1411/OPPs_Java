package com.codes.properties.polymorphism;

public class Square extends Shapes {

    double edge;

    @Override
    void area() {
        System.out.println("Area is side * side");
    }
}
