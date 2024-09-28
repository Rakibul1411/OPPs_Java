package com.codes.staticExample;

public class Main {
    public static void main(String[] args) {
        /*
        such properties that doesn't directly relate to object those are known
        as static variables or static methods. this static attributes belong to the class not the object
        for example ---> no of population in earth, is fixed for all people in the earth.
         */

        Human rony = new Human(22, "Rony", 1000, false);
        System.out.println(Human. population);

        Human rookie = new Human(32, "Rookie", 1008, true);

        System.out.println(Human.population);
        System.out.println(Human.population);

//        greeting();
        Main main = new Main();
        main.greeting();
        main.cycle();

        // Both are the same
        Main.bird();
        bird();
        fun();

        // Non-static method access by creating the object of the class.


    }

    static void fun() {
        System.out.println("I am in Fun method");
        // greeting();
        /*
        can't use this because it requires an instance,
        but the function is using it in doesn't depend on instance
        */

        Main obj = new Main();
        obj.greeting();
    }

    // we know that something which is not static, belongs to an object
    // this is dependent on objects
    void greeting() {
        System.out.println("I am in Greeting method");
        cycle(); // this is work
    }

    // this is not dependent on objects
    static void bird() {
        System.out.println("I am in Bird method.");
    }

    void cycle() {
        System.out.println("I am in cycle method.");
    }


}
