package com.ohgiraffers.section3.abstraction;

public class CarRacer {
    private final Car car = new Car();

    public void turnOn() {
        car.turnOn();
    }

    public void stepAccelerator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
