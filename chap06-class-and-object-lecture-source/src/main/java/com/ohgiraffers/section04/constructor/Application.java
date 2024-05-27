package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {

        /*
         * 생성자란?
         *
         * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고,
         * 인스턴스를 생성할 때(new 키워드를 만날 때) 호출된다.
         * 생성자 함수에 매개변수가 없는 생성자를 기본 생성자(default constructor)라고 하며,
         * 기본 생성자는 compiler에 의해 자동으로 추가되기 때문에
         * 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
         */

        // 기본생성자를 호출해 인스턴스(객체) 생성
        User user1 = new User();
        System.out.println(user1.getInfo());
        System.out.println();

        // 매개변수있는 생성자를 호출해 인스턴스(객체) 생성
        User user2 = new User("user02", "pass02", "홍길동");
        System.out.println(user2.getInfo());
        System.out.println();

        // 모든 필드를 초기화하는 생성자를 호출해 인스턴스(객체) 생성
        User user3 = new User("user03", "pass03", "위성민", new java.util.Date());
        System.out.println(user3.getInfo());
        System.out.println();

        // 복사생성자를 호출헤 인스턴스(객체) 생성
        User user4 = new User(user3);
        System.out.println(user4.getInfo());
    }
}
