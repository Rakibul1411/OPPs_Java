package com.codes.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4, 7, 9.0);
        Box box2 = new Box(box1);

        System.out.println(box1.h + " " + box1.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);

        System.out.println(box3.h + " " + box3.weight);
        System.out.println(box4.h + " " + box4.w + " " + box4.weight);

        // created object is BoxWeight type but Referencing Box type (Reference type Box)
        // Only access the SuperClass attributes, not access SubClass attributes
        // This is a reference type of Box, and it is referencing to an object type BoxWeight
        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w);

        // Opposite case not valid
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6.w);


        BoxPrice boxPrice = new BoxPrice(5, 8, 200);

        Box box6 = new Box();
        Box.greeting();
        //box6.greeting(); //  this also work

        // static method can be inherited but can't be overridden
        // because static method doesn't depend on object
        Box box7 = new BoxWeight();
        box7.greeting();
        BoxWeight boxWeight = new BoxWeight();
        boxWeight.greeting();

    }
}
