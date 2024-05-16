package com.ohgiraffers.section01.method;

public class Calculator {

    // 삼항연산자로 두 수를 비교해서 작은 값을 return 해주는 메소드
    public int nonStaticMinNumberOf(int first, int second) {

//        int result = (first > second)? second : first;
//        return result;

        return (first > second)? second : first;
    }

    // 삼항연산자로 두 수를 비교해서 큰 값을 return 해주는 메소드
    public static int staticMaxNumberOf(int first, int second) {

        return (first > second)? first : second;
    }

    // 더하기, 빼기, 곱하기, 나누기, 나머지
    // 이 각각을 수행할 수 있는 메소드를 만들고
    // 더하기, 빼기, 곱하기, 나누기 -> non-static
    // 나머지 -> static

    // 더하기
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    // 빼기
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    // 곱하기
    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    // 나누기
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    // 나머지
    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }
}
