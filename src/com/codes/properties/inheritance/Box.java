package com.codes.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;
    double weight;

    static void greeting() {
        System.out.println("Hey, I am in Box Class..!!");
    }

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        // super(); // Object Class
        this.w = side;
        this.h = side;
        this.l = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box box) {
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }

    public void information() {
        System.out.println("Running the Box...");
    }
}
