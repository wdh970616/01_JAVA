package com.ohgiraffers.section04.use3;

import org.w3c.dom.ls.LSOutput;

public class Dicer {

    public void throwDice(Dice dice) {
        int diceNumber = dice.getNumber();
        System.out.println("주사위에서 " + diceNumber + "번이 나왔군요.");
    }

}
