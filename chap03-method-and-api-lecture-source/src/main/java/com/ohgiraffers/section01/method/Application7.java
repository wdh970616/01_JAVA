package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        // 매개변수와 리턴값의 복합 활용

        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNumber(first, second));
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNumber(first, second));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNumber(first, second));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNumber(first, second));
    }

    // 두 수를 더한 결과를 반환하는 메소드
    public int plusTwoNumber (int first, int second) {
        return first + second;
    }
    // 두 수를 뺀 결과를 반환하는 메소드
    public int minusTwoNumber (int first, int second) {
        return first - second;
    }
    // 두 수를 곱한 결과를 반환하는 메소드
    public int multipleTwoNumber(int first, int second) {
        return first * second;
    }

    // 두 수를 나눈 결과를 반환하는 메소드
    public int divideTwoNumber(int first, int second) {
        return first / second;
    }
}
