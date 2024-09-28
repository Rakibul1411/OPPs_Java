package com.codes.singleton;

import com.codes.access.A;

public class SubClass2 extends A {

    public SubClass2(int num, String name) {

        super(num, name);
    }

    public static void main(String[] args) {

        A a = new A(4, "SubClass");
//        a.number; // not access because 'A' does not know what's extended in Subclass
    }
}
