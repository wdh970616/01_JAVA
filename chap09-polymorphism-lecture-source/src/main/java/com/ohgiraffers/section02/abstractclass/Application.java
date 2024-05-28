package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /*
         * 추상클래스와 추상메소드
         * 추상메소드를 0개 이상 포함하는 클래스를 추상클래스라고 한다.
         * 추상클래스는 클래스 선언부에 abstract 키워드를 명시해야한다.
         * 추상클래스로는 인스턴스를 생성할 수 없다.
         * 추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야한다.
         * 이 때, 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할 수 있다.
         *
         * 추상클래스에 작성한 추상메소드는 반드시 후손이 오버라이딩해서 작성해야한다.
         * 후손클래스들의 메소드들의 공통 인터페이스로의 역할을 수행할 수 있다.
         * 추상클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메소드는 다형성이 적용되어
         * 동적 바인딩에 의해 다양한 응답을 할 수 있게 된다.
         *
         * 추상클래스를 상속받아 구현할 때는 extends 키워드를 사용하며
         * 자바에서는 extends로 상속받을시 하나의 부모클래스만 가질 수 있다. (단일상속)
         *
         * 추상메소드
         * 메소드의 선언부만 있고 구현부가 없는 메소드
         * 추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야한다.
         * 예) public abstract void method();
         */

        // 추상클래스는 인스턴스 직접 생성 불가
//        Product product = new Product();

        // 추상메소드, 추상클래스를 사용하기 위해서는 추상클래스를 상속받은 객체를 이용해야한다.
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        // 다형성을 적용해서 추상클래스를 래퍼런스 타입으로 활용 가능
        Product product = new SmartPhone();

        // 동적 바인딩에 의해 SmartPhone 메소드가 호출된다.
        product.abstractMethod();

        // 추상클래스가 가진 메소드도 호출 가능
        product.nonStticMethod();

        Product.staticMethod(); // 인스턴스 생성이 불필요

        /*
         * 추상클래스를 사용하는 이유
         * 추상클래스의 추상메소드는 오버라이딩에 대한 강제성이 부여된다.
         * -> 여러 클래스들을 그룹화해서 필수 기능을 정의해 강제성을 부여하고
         *    개발시 일관된 인터페이스를 제공할 수 있다.
         *
         * 하지만 다른 클래스를 상속받고있는 클래스를 작성할때는, 추상클래스를 추가로 상속이 불가능하다.
         * -> 추상클래스보다 더 강제성이 강한 인터페이스(interface)라는 메커니즘을 제공한다.
         */

    }
}
