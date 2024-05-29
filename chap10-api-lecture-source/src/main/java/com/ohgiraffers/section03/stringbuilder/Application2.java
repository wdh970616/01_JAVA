package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {

        // StringBuilder에서 자주 사용되는 메소드

        /*
         * delete() : 시작 인덱스와 종료 인덱스를 이용해서, 문자열에서의 시작 인덱스부터 종료 인덱스 전까지를 제거
         * deleteCharAt() : 문자열 인덱스를 이용해서 해당 인덱스의 문자 하나를 제거
         * -> 둘 다 원본에 영향을 줌
         */

        StringBuilder sb = new StringBuilder("javaoracle");
        StringBuilder sb2 = new StringBuilder("javaoracle");

        System.out.println("sb = " + sb);
        System.out.println("sb.delete(2, 5) : " + sb.delete(2, 5));
        System.out.println("sb의 원본 확인 = " + sb);
        System.out.println();

        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.deletecharAt(2) : " + sb2.deleteCharAt(2));
        System.out.println("sb2의 원본 확인 = " + sb2);


    }
}
