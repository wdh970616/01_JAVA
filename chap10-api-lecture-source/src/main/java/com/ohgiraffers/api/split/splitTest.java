package com.ohgiraffers.api.split;

public class splitTest {
    public static void main(String[] args) {

        String javaProgram = "J a v a P r o g r a m";
        String[] sarr = javaProgram.split(" ", -1);
        String toCarr = String.join("", sarr);
        char[] carr = toCarr.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            System.out.println("char[" + i + "] = " + carr[i]);
        }
        String reStr = String.valueOf(carr);
        System.out.println(reStr.toUpperCase());
    }
}
