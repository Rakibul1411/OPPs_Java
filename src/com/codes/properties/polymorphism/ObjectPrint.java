package com.codes.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    // every class in java extends the Object class
    // this method is define is object class
    @Override
    public String toString() {
        return "ObjectPrint [num=" + num + "]";
    }

    public static void main(String[] args) {
        ObjectPrint objectPrint = new ObjectPrint(5);
        System.out.println(objectPrint);
    }
}
