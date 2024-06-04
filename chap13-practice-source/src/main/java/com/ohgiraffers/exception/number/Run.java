package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        new Run().test();
    }

    public void test() {
        NumberProcess np = new NumberProcess();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.print("첫번째 수를 입력해주세요 : ");
            a = sc1.nextInt();
            System.out.print("두번째 수를 입력해주세요 : ");
            b = sc2.nextInt();
            System.out.println("[" + a + "]은(는) [" + b + "]의 배수가 " + (np.checkDouble(a, b) ? "맞습니다." : "아닙니다."));
        } catch (NumberRangeException ne) {
            System.out.println(ne.getMessage());
        }
    }
}
