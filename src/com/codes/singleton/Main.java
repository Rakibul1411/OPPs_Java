package com.codes.singleton;

import com.codes.access.A;

public class Main {
    public static void main(String[] args) {

        Singleton obj1 =Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        // all 3 references variables are pointing to just one object.

        System.out.println(obj1.age);

        A a = new A(10, "Rony");
        a.getNum();

        // if access modifier is not use the default access modifier used, that is 'protected'
//        int store = a.prime;
    }
}
