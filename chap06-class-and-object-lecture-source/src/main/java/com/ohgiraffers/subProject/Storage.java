package com.ohgiraffers.subProject;

public class Storage {
    int coffeeBeans;
    int milk;
    int chocoSyrup;
    int ice;
    int peach;

    public void openUpCafe() {
        this.coffeeBeans = (int) (Math.random() * 100 + 30);
        this.milk = (int) (Math.random() * 50 + 1);
        this.ice = (int) (Math.random() * 50 + 1);
        this.chocoSyrup = (int)(Math.random() * 30 + 1);
        this.peach = (int) (Math.random() * 30 + 1);
    }
}
