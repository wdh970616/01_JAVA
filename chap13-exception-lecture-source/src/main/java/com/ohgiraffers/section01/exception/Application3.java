package com.ohgiraffers.section01.exception;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExceptionTest et = new ExceptionTest();

        System.out.print("물건의 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.print("보유금을 입력해주세요 : ");
        int money = sc.nextInt();

        try {
            et.checkEnoughMoney(price, money);
            System.out.println("========== 상품 구입 가능 ==========");
        } catch (Exception e) {
            System.out.println("========== 상품 구입 불가 ==========");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
