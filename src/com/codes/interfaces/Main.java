package com.codes.interfaces;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Engine engine = new Car();

          // because parent class only know the overridden methods and their own class attributes
//        System.out.println(engine.a);

        car.accelerate();
        car.start();
        car.stop();

        Media carMedia = new Car();

        carMedia.stop();
        carMedia.start();


        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stopMusic();
        niceCar.upgradeEngine();
        niceCar.start();
    }
}
