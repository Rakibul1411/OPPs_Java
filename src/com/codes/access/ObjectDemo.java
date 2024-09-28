package com.codes.access;

import java.lang.Object;

public class ObjectDemo {

    int num;
    float gpa;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo(int num) {
        super();
        this.num = num;
    }

    public ObjectDemo (int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        ObjectDemo demo = new ObjectDemo(34);
        System.out.println(demo.hashCode());

        ObjectDemo demo1 = demo;
        System.out.println(demo1.hashCode());


        ObjectDemo obj1 = new ObjectDemo(2, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(2, 78.9f);

        // check pointing the same reference or not
        if (obj1 == obj2) {
            System.out.println("obj1 is equal obj2");
        }

        // check values are equal or not
        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal obj2");
        }

        //  the getClass() method is used to get the runtime class (type) of an object.
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());

    }

}
