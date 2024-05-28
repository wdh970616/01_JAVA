package com.ohgiraffers.section03.interfaceimplements;

public class Appplication {
    public static void main(String[] args) {

        // 인터페이스에 대해 이해
        /*
         * 인터페이스(interface)
         * 자바의 클래스와 유사한 형태지만, 추상메소드와 상수 필드만 가질수있는 클래스의 변형체
         */

        /*
         * 인터페이스의 사용목적
         * 1. 추상클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다. (표준화)
         * 2. 자바의 단일상속의 단점을 극복할 수 있다. (다중 상속)
         */

        // 인스턴스를 직접 생성하지 못하고 생성자 자체가 존재하지 않는다.
//      InterProduct interProduct = new InterProduct();
        InterProduct interProduct = new Product();

        /*
         * 인터페이스의 추상메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출
         * - 컴파일 당시에 해당 타입의 메소드와 연결되어있다가
         * - 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것
         */
        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        // 오버라이딩 하지 않으면 인터페이스의 default 메소드 호출
        interProduct.defaultMethod();

        // static 메소드는 인터페이스명.메소드명() 으로 호출함.
        InterProduct.staticMethod();

        // 상수 필드 접근도 인터페이스명.핑드명 으로 접근
        System.out.println("InterProduct.MAX_NUM = " + InterProduct.MAX_NUM);
        System.out.println("InterProduct.MIN_NUM = " + InterProduct.MIN_NUM);
    }
}
