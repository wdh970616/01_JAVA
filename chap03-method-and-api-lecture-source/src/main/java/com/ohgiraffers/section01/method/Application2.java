package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("메인메소드 시작함...");

        // 호출준비
        Application2 app2 = new Application2();

        app2. methodA();
        app2. methodB();
        app2. methodC();

        System.out.println("메인메소드 종료됨...");
    }

    public void methodA() {
        System.out.println("method A 호출함...");
        System.out.println("method A 종료됨...");
    }

    public void methodB() {
        System.out.println("method B 호출함...");
        System.out.println("method B 종료됨...");
    }

    public void methodC() {
        System.out.println("method C 호출함...");
        System.out.println("method C 종료됨...");
    }
}
