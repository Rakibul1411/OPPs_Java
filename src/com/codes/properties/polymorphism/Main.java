package com.codes.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        // Types of Method in Overriding that is called depends on what the type of object is created
        Shapes shapes = new Square();
        shapes.area(); // For method overriding, this is happened
        // this show error
        //shapes.edge;


        /*  For Method Overriding Case-----
           If the types of Reference variables as the Parent class
           but the Object is of the type of SubClass or Child class
           for this case always called the child class override method
           this is called 'Upcasting'

           this entire things are known as how overriding happens
         */

    }
}
