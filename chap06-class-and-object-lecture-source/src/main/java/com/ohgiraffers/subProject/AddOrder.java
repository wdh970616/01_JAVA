package com.ohgiraffers.subProject;

import java.util.Scanner;

public class AddOrder {
    Kiosk kiosk = new Kiosk();
    ;
    private Scanner sc = new Scanner();

    public void addOrder() {
        if (Coffee.CoffeeBeans() > 20) {
            Coffee[] coffee = new Coffee[2];
            System.out.println("현재 주문 가능한 잔 수 : " + (Coffee.CoffeeBeans() / 20));
            System.out.print("주문하실 메뉴의 번호를 입력해주세요 : ");
            String menu = sc.next();
            if (menu.equals("1") || menu.equals("아메리카노")) {
                String name = "아메리카노";
                System.out.println("""
                        (1) HOT
                        (2) ICE
                        """);
                while (true) {
                    System.out.print("주문하실 메뉴의 옵션을 입력해주세요 : ");
                    String hotOrIce = sc.next();
                    if (hotOrIce.equals("1") || hotOrIce.equals("HOT")) {
                        String option = "HOT";
                    }
                    if (hotOrIce.equals("2") || hotOrIce.equals("ICE")) {
                        String option = "ICE";
                    }
                    if (hotOrIce.equals("취소")) {
                        return;
                    } else {
                        System.out.println("! 옵션을 잘못 입력하셨습니다 !");
                    }
                }
            }
            if (menu.equals("2") || menu.equals("카페라떼") || menu.equals("라떼")) {

            }
            if (menu.equals("종료")) {
                return;
            } else {
                System.out.println("! 메뉴를 잘못 입력하셨습니다 !");

            }
        } else {
            System.out.println("현재 원두 재고가 없어 주문이 불가합니다. 죄송합니다.");
            return;
        }
    }
}
