package com.codes.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("I am in message method.");
//        System.out.println(this.age); // Not work because age is instance variable
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
