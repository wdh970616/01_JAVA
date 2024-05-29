package com.ohgiraffers.section04.wrapper;

import java.util.Calendar;

public class Application3 {
    public static void main(String[] args) {

        // 기본자료형값을 문자열로 변경
        /*
         * valueOf : 기본자료형값을 wrapper 클래스로 변환시킴
         * toString() : 필드값을 문자열로 반환
         */
        String b = Byte.valueOf((byte) 1).toString();
        String s = Short.valueOf((short) 2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        // String 클래스의 valueOf()를 사용할 수도 있다
        String str = String.valueOf(10);

        // 문자열 합치기를 이용해 String으로 변환할 수도 있다.
        String str2 = 123 + " ";
    }
}
