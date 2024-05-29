package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {

        // Object의 equals()

        /*
         * equals()
         *
         * equals 메소드는 매개변수로 전달받은 인스턴스와 '==' 연산하여 true or false 를 반환.
         * 동일한 인스턴스인지를 비교하는 기능임.
         *
         * 동일객체, 동등객체
         * 동일객체 : 주소가 동일한 인스턴스
         * 동등객체 : 주소는 다르더라도 필드값들이 동일한 객체
         */

        // equals()의 기본기능은 동일객체 판단을 한다.
        // -> 동일한 필드값을 가지는 객체를 같은 객체로 판단할 수 있도록 하고싶은 경우가 생긴다.
        // -> 오버라이딩을 통해 각각의 필드가 동일한 값을 가지는지 확인 가능

        Book book1 = new Book(1, "홍길동전", "허준", 50000);
        Book book2 = new Book(1, "홍길동전", "허준", 50000);

        // '==' 연산과 equals()는 주소값을 비교
        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("========== equals() 오버라이딩 이후 ==========");
        System.out.println("두 인스턴스의 equals() 비교 : " + book1.equals(book2));

    }
}
