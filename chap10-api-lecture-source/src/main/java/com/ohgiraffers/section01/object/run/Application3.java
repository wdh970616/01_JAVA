package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application3 {
    public static void main(String[] args) {

        // Object의 hashCode()

        /*
         * Object 클래스의 명세에 작성된 일반 규약에 따르면
         * equals() 메소드를 재정의하는 경우  hashCode() 메소드도 재정의하도록 되어있다.
         * -> 같은 값을 가지는 동등 객체는 같은 해시코드값을 가져야 한다는 규약때문임.
         * (강제성은 없지만 규약대로 해주는게 좋다)
         */

        Book book1 = new Book(1, "홍길동전", "허준", 50000);
        Book book2 = new Book(1, "홍길동전", "허준", 50000);

        System.out.println("======== hashCode() 오버라이딩 이후 ========");
        System.out.println("book1의 hashCode : " + book1.hashCode());
        System.out.println("book2의 hashCode : " + book2.hashCode());

    }
}
