package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        /*
         * super : 자식클래스를 이용해서 객체를 생성할 때 부모생성자를 호출하여 부모 클래스의 인스턴스도 함께 생성하게된다.
         *         이때 생성한 부모의 인스턴스 주소를 보관하는 래퍼런스 변수
         * super() : 부모생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는 부모의 생성자를 호출하게 된다.
         *           this()가 해당하는 클래스내의 다른 생성자를 호출하는 구문이라면
         *           super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를 호출할 수 있도록 한 구문이다.
         */

        // Product -> Computer
        // Product 기본생성자로 인스턴스 생성
//        Product product1 = new Product();
//        System.out.println(product1.getInformation());

        // Product의 모든 필드를 초기화하는 생성자로 인스턴스 생성
        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드", 2398000, new java.util.Date());
        System.out.println(product2.getInformation());
        System.out.println();

        // Compute 기본 생성자
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());
        System.out.println();

        // Computer의 모든 필드를 초기화하는 생성자로 인스턴스 생성
        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());
        System.out.println();

        // Computer의 부모 필드도 함께 초기화하는 생성자로 인스턴스 생성
        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드", 2398000, new java.util.Date(), "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());
    }
}
