package com.ohgiraffers.section04.use3;

public class SuperDice extends Dicer implements Dice {

    @Override
    public int getNumber() {
        return (int) (Math.random() * 10 + 1);
    }
}
