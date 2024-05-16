package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("main() 시작됨...");

        /*
        * 메소드 호출 방법
        *
        * 1. 사용준비
        * [클래스명] [사용할 이름] = new [클래스명]();
        *
        * 2. 사용
        * [사용할 이름].[메소드명]();
         */

        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨...");
    }

    /*
     * [접근제어자] [반환타입] [메소드이름] ([매개변수...]) {
     *   // 실행할 코드
     *
     *   // 반환타입이 있을 경우 반환타입에 맞게 return
     * }
     */

    public void methodA() {
        System.out.println("method A 호출함...");
        methodB();
        System.out.println("method A 종료됨...");
    }

    public void methodB() {
        System.out.println("method B 호출함...");
        methodC();
        System.out.println("method B 종료됨...");
    }

    public void methodC() {
        System.out.println("method C 호출함...");
        System.out.println("method C 종료됨...");
    }
}
