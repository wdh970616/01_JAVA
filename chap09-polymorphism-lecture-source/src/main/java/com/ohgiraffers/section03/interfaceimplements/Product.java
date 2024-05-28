package com.ohgiraffers.section03.interfaceimplements;

public class Product implements InterProduct {

    /*
     * 클래스에서 인터페이스를 상속받을때에는 implements 키워드를 사용한다.
     * 인터페이스는 여러개를 상속받을 수 있으며
     * extends로 다른 클래스를 상속받는 경우에도, 그것과 별개로 인터페이스도 추가 상속이 가능하다.
     * 단, extends를 키워드 앞에 작성하고, implements를 뒤에 작성한다. (순서 바뀌면 에러)
     */

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출함...");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출함...");
    }

    // static 메소드는 오버라이딩이 불가하다
//    @Override
//    public static void staticMethod() {}

    // default 메소드도는 인터페이스에서만 작성가능하다.
//    @Override
//    public default void defaultMethod() {}

    // default 키워드를 빼면 오버라이딩 가능하다.
    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의 defaultMethod 호출함...");
    }
}
