package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        // 여러개의 전달인자를 이용한 메소드의 호출 테스트
        Application4 app4 = new Application4();

        String name = "위성민";
        int age = 26;
        char GENDER = '남';

        app4.testMethod(name, age, GENDER);
    }

    // "당신의 이름은 ~이고, 나이는 ~이며, 성별은 ~입니다."
    public void testMethod(String name, int age, final char GENDER) {

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + GENDER + "입니다.");
    }
}
