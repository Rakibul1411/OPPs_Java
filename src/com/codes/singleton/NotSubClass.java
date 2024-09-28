package com.codes.singleton;

import com.codes.access.A;

// protected access modifier doesn't work different packages and not subclass
// no modifier does not work subclass on different packages + different pkg and not subclass

public class NotSubClass {

    public NotSubClass(int num, String name) {

        //super(num, name);
    }
    public static void main(String[] args) {

        NotSubClass notSubClass = new NotSubClass(45, "Rony");
        //int n = notSubClass.number;
    }
}
