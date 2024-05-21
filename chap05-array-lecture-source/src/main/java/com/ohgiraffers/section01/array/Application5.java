package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {

        // 랜덤한 카드를 한장 뽑아서 출력하기

        // 모양과 카드 숫자별로 저장할 값
        String[] cardShapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"ACE", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

        // 배열에서 랜덤으로 선택할 인덱스
        int randomShapeIndex = (int) (Math.random() * cardShapes.length);   // 0 ~ 3
        int randomNumberIndex = (int) (Math.random() * cardNumber.length);  // 0 ~ 12

        // 뽑은 카드 출력
        System.out.println("당신이 뽑은 카드는 '" + cardShapes[randomShapeIndex] + " " + cardNumber[randomNumberIndex] + "' 입니다.");
    }
}
