package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        // 메소드 활용 연습

        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();

        int plus = calc.plus(num1, num2);
        System.out.println("두 수의 합 = " + plus);

        int minus = calc.minus(num1, num2);
        System.out.println("두 수의 차 = " + minus);

        int multiple = calc.multiple(num1, num2);
        System.out.println("두 수의 곱 = " + multiple);

        int divide = calc.divide(num1, num2);
        System.out.println("두 수를 나눈 몫 = " + divide);

        int remainder = calc.remainder(num1, num2);
        System.out.println("두 수를 나눈 나머지 = " + remainder);
    }
}
