package com.codes.abstractDemo;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(20);
        son.career();

        Daughter daughter = new Daughter(30);
        daughter.career();

        // Can't create object for abstract class because abstract method doesn't contain body.
//        Parent parent = new Parent();

        Parent.hello();
        son.normal();
        daughter.normal();

        // Abstract class becomes Reference variable
        Parent daughter2 = new Daughter(20);
        daughter2.career();

        Parent son2 = new Son(20);
        son2.normal();
        System.out.println(son2.score);

    }
}
