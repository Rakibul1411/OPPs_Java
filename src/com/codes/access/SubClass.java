package com.codes.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass(1, "SubClass");
        int num = sub.number;

        System.out.println(sub instanceof A);
        System.out.println(sub instanceof SubClass);
        System.out.println(sub instanceof Object);
//        System.out.println(sub instanceof ObjectDemo); // false
    }
}
