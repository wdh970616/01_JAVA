package com.ohgiraffers.subProject;

public class CoffeeBeans {

    private final static int coffeeBeans = (int)(Math.random() * 101 + 100);

    public static int coffeeBeans() {
        return CoffeeBeans.coffeeBeans();
    }

}
