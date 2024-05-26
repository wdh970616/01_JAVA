package com.ohgiraffers.subProject;

public class Storage {
    int coffeeBeans;
    int milk;
    int peachTeaBag;


    public void materialSet() {
        this.coffeeBeans = (int) (Math.random() * 6 + 5);
        this.milk = (int) (Math.random() * 4 + 2);
        this.peachTeaBag = (int) (Math.random() * 4 + 2);
    }
}
