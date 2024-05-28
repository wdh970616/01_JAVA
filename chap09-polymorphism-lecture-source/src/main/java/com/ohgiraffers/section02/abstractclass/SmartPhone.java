package com.ohgiraffers.section02.abstractclass;

// 자바에서는 단일 상속만 가능하다.
public class SmartPhone extends Product {

    public SmartPhone() {
    }

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }

}
