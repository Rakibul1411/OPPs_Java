package com.codes.interfaces.extendDemo2;

public class Main implements B, A {
    
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.greet();

        A.greeting();
    }

}
