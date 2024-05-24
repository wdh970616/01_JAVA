package com.ohgiraffers.subProject;

public class Barista {

    Storage storage = new Storage();

    public void makeAmericano() {
        if (storage.coffeeBeans > 0) {
            storage.coffeeBeans--;
            System.out.print("");
        }
    }
}
