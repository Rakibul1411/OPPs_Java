package com.codes.staticExample;

class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        Parent.greet();  // Output: Hello from Parent
        Child.greet();   // Output: Hello from Child

        Parent obj = new Child();
        obj.greet();     // Output: Hello from Parent (because method is hidden, not overridden)
    }
}
