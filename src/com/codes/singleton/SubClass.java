package com.codes.singleton;

import com.codes.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {

        super(num, name);
    }

    public static void main(String[] args) {

        SubClass sub = new SubClass(1, "SubClass");
        int num = sub.number;

        A a = new A(num, "SubClass");
//        a.number; // not access because 'A' does not know what's extended in Subclass
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass sub = new SubSubClass(5, "SubSubClass");

        // access protected attributes from subclass of subclass from different package
        int num = sub.number;
    }
}

