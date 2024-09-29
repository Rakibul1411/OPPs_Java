package com.codes.finalAll;

class Parent1 {
    // Regular static method
    public static void regularStaticMethod() {
        System.out.println("Parent's static method");
    }

    // Final static method
    public static final void finalStaticMethod() {
        System.out.println("Parent's final static method");
    }
}

class Child1 extends Parent {
    // Hides the regular static method in the Parent class
    public static void regularStaticMethod() {
        System.out.println("Child's static method");
    }

    // Attempt to hide or redefine the final static method (will cause an error)
    // public static void finalStaticMethod() {
    //    System.out.println("Child's final static method");
    // }  // Compilation error: cannot override final method from Parent
}

public class StaticFinalBoth {

    public static void main(String[] args) {
        // Calling static methods using class references
        Parent1.regularStaticMethod();  // Output: Parent's static method
        Child1.regularStaticMethod();   // Output: Child's static method

        Parent1.finalStaticMethod();    // Output: Parent's final static method
//        Child1.finalStaticMethod();     // Output: Parent's final static method
    }
}

