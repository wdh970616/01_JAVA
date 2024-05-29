package com.ohgiraffers.section04.use3;

public class SuperDice extends Dicer implements Dice {

    // 오버라이딩한 메소드에 출력값으로 랜덤한 수 출력하는 함수를 바로 입력하여
    // MAX, MIN 숫자 초기화 생략함

    @Override
    public int getNumber() {
        return (int) (Math.random() * 10 + 1);
    }
}
