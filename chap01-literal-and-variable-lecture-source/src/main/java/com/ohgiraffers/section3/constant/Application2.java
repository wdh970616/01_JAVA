package com.ohgiraffers.section3.constant;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 상수의 명명 규칙
        *
        * 컴파일 에러를 일으키는 명명 규칙은 상수와 변수가 동일하다.
        *
        * 개발자들끼리의 암묵적인 규칙에서 일부 차이가 있다.
        * 1. 모든 문자는 대문자 혹은 숫자만 사용한다.
        * 2. 단어와 단어 사이는 언더스코어(_)를 사용한다.
         */

        // 모든 문자는 대문자 혹은 숫자만 사용한다.
        final int AGE1 = 20;

        // 단어와 단어의 연결은 언더스코어(_)를 사용한다.
        final int MAX_AGE = 40;
        final int MIN_AGE = 20;
    }
}
