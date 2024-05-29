package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 파싱 (parsing)
         * : 문자열(String)값을 기본자료형값으로 변경하는것
         */
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");   // 8l 안됨
        float f = Float.parseFloat("4.0f");    // 4.0f는 가능
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);   // 문자열은 charAt() 사용

    }
}
