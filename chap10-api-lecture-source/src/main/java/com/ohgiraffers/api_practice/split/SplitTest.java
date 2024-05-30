package com.ohgiraffers.api_practice.split;

import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {

        String javaProgram = "J a v a P r o g r a m";
        String[] sarr = javaProgram.split(" ", -1);
        char[] carr = new char[sarr.length];
        for (int i = 0; i < sarr.length; i++) {
            carr[i] = sarr[i].charAt(0);
            System.out.println("carr[" + i + "] = " + carr[i]);
        }
        System.out.println("분리전 글자 = " + javaProgram);
        System.out.println("분리전 글자 갯수 = " + javaProgram.length());
        System.out.println("분리후 문자배열 내용 = " + Arrays.toString(carr));
        String reStr = String.valueOf(carr);
//      String reStr = new String(carr);
//      String reStr = "";
//      for (char ch : carr) {
//          reStr += ch;
//      }
        System.out.println("char[]을 다시 String으로 변환하고 모두 대문자로 변환하여 출력 : " + reStr.toUpperCase());
    }
}
