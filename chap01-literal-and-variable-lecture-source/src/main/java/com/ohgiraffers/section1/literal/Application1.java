package com.ohgiraffers.section1.literal;

public class Application1 {
    public static void main(String[] args) {
        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");
        System.out.println("편하네요");

        //수업목표 : 여러 가지 값의 형태를 출력 할 수 있다.

        //  정수 출력
        System.out.println(123);

        //  실수 출력
        System.out.println(12.3);

        //  문자 출력
        System.out.println('a');    //  문자 형태의 값은 홀따옴표로 감싸주어야한다.
        //System.out.println('ab'); //  문자가 아닌 문자열이라서 오류가 나는 상황.
        //System.out.println('');
        System.out.println('1');    //  숫자 값이지만 홀따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.

        //  문자열 출력
        System.out.println("곧 점심 야호");  //  문자열은 문자 여러개가 나열 된 형태를 의미하며 쌍따옴표로 문자열을 감싸주어야한다.
        System.out.println("123");  //  필기 : 정수 이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println(""); //  아무것도 없는 빈쌍따옴표도 문자열로 취급된다.
        System.out.println("a");    //  한개의 문자도 쌍따옴표로 감사면 문자열이다. (문자 'a'와 다름)

        //  논리형 출력
        System.out.println(true);
        System.out.println(false);

    }
}
