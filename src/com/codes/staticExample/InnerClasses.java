package com.codes.staticExample;

class Fun {
    static int age;

    public Fun(int age) {
        Fun.age = age;
    }
}

// Outside class can't be static.
// Static attributes, methods are class level attributes and methods
public class InnerClasses {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test test1 = new Test("Rony");
        Test test2 = new Test("Rabbi");

        System.out.println(test1.name);
        System.out.println(test2.name);

        Fun fun1 = new Fun(10);
        Fun fun2 = new Fun(16);

        System.out.println(fun1.age);
        System.out.println(fun2.age);
    }

}
