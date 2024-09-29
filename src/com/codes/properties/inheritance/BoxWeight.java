package com.codes.properties.inheritance;

public class BoxWeight extends Box{
    double weight;
    double shape;

    static void greeting() {
        System.out.println("Hey, I am in BoxWeight Class..!!");
    }

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {

        // Used to initialise values present in parent class
        // When super is not called then default constructor is called
        super(l, h, w); // Call the parent class constructor

        // Access the Parent Class attributes
        // If Parent Class has not same fields as child Class then 'this' keyword is used
        System.out.println(super.weight);
        System.out.println(this.h);

        // Access the child Class attributes
        System.out.println(this.weight);

        this.weight = weight;
    }
}
