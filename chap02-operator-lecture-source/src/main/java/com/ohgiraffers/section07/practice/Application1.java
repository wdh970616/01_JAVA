package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("[연산자 활용 연습 문제]");
        System.out.println("산술 연산자");
        int a = 15;
        int b = 4;
        int result1 = a/b;
        System.out.println("1번 답 = " + result1);
        System.out.println("2번 답 = 8%3;");
        System.out.println("3번 답 = System.out.println(5*2-3);");

        System.out.println();
        System.out.println("복합 대입 연산자");
        int x = 10;
        int y = 20;
        int z = 8;
        int bokhap1 = x += 5;
        int bokhap2 = y /=4;
        System.out.println("1번 답 = " + bokhap1);
        System.out.println("2번 답 = " + bokhap2);
        System.out.println("3번 답 = " + (z%=3));

        System.out.println();
        System.out.println("증감 연산자");
        int i = 0;
        System.out.println("1번 답 = " + (++i));
        int j = 10;
        System.out.println("2번 답 = " + (--j));
        int k = 5;
        k = ++k;
        System.out.println("3번 답 -> int k = 5;");
        System.out.println("         k = ++k;");
        System.out.println("         System.out.println(k);");

        System.out.println();
        System.out.println("비교 연산자");
        int num1 = 10;
        int num2 = 20;
        int age = 28;
        boolean bigyo1 = num1 == num2;
        System.out.println("1번 답 -> num1==num2");
        boolean bool2 = 15 > 10;
        System.out.println("2번 답 -> 15>10");
        boolean bool3 = age >= 18;
        System.out.println("3번 답 -> age>=18");

        System.out.println();
        System.out.println("논리 연산자");
        System.out.println("1번 답 -> a&&b");
        boolean bool4 = (age >= 18) && (age < 65);
        System.out.println("2번 답 -> (age>=18)&&(age<65)");
        x = 10;
        y = 20;
        boolean bool5 = (x != 10) || (y >= 25);
        System.out.println("3번 답 -> (x!=10)||(y>=25)");
    }
}
