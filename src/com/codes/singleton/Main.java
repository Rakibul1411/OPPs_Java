package com.codes.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj1 =Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        // all 3 references variables are pointing to just one object.

        System.out.println(obj1.age);
    }
}
