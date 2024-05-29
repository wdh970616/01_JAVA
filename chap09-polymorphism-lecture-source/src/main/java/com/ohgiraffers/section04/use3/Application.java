package com.ohgiraffers.section04.use3;

public class Application {
    public static void main(String[] args) {

        Dicer dicer = new Dicer();

//        Dice dice = new HellDice();
        Dice dice = new SuperDice();

        dicer.throwDice(dice);
    }
}
