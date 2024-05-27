package com.ohgiraffers.subProject;public class Storage {

    static int Coffeebeans;

    private Storage() {
    }

    private static void setCoffeebeans(int coffeebeans) {
        Coffeebeans = (int)(Math.random() * 1001 + 1000);
    }

    public static int getCoffeebeans() {
        return Coffeebeans;
    }


}
