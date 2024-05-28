package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    // 추상클래스는 필드를 가질 수 있다.
    private int nonStaticField;
    private static int staticField;

    // 생성자도 만들 수 있다. -> 하지만 인스턴스를 생성할 수는 없다.
    public Product() {
    }

    // 추상클래스는 일반적인 메소드를 가질수 있다.
    public void nonStticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출함...");
    }

    public abstract void abstractMethod();
}
