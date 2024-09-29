package com.codes.finalAll;

class Parent {
    // Final method, cannot be overridden
    public final void displayMessage() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    // This would cause a compilation error
    // @Override
    // public void displayMessage() {
    //     System.out.println("Trying to override the final method.");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage();  // Inherited final method from Parent class
    }
}
