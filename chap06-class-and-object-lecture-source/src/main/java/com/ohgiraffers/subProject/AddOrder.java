package com.ohgiraffers.subProject;

import java.util.Scanner;

public class AddOrder {

    private Scanner sc = new Scanner(System.in);

    public void addOrder() {
        Coffee[] coffees = new Coffee[2];
        System.out.println("***** 성민카페를 찾아주셔서 감사합니다 *****");
        if (CoffeeBeans.coffeeBeans() / 20 > 0) {
            while (true) {
                System.out.print("""
                        << 메뉴 목록 >>
                        (1) 아메리카노
                        (2) 카페라떼
                        (9) 종료
                        원하는 메뉴의 번호를 입력해주세요 : """);
                int no = sc.nextInt();
                switch (no) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("! 잘못 입력하셨습니다 !");
                }
            }
        }
    }
}
