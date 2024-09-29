package com.codes.interfaces;

public class Car implements Engine, Brake, Media{

    int start;

    @Override
    public void brake() {
        System.out.println("I brake like a normal Car.");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal Car.");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal Car.");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal Car.");
    }
}
