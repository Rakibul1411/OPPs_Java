package com.codes.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music is playing");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopping");
    }
}
