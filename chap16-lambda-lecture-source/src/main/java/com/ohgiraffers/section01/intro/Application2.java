package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y;
        System.out.println("20과 10의 합은? " + sum.sumTwoNumber(20, 10));

        OuterCalculator.Minus minus = (x, y) -> x - y;
        System.out.println("20과 10의 차는?" + minus.minusTwoNumber(20, 10));

        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        System.out.println("20과 10의 곱은? " + multiple.multipleTwoNumber(20, 10));

        OuterCalculator.Division division = (x, y) -> x / y;
        System.out.println("20과 10을 나눈 몫은? " + division.divisionTwoNumber(20, 10));

    }
}
