package com.ohgiraffers.subProject;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);

    public void kiosk() {
        AddOrder addOrder = new AddOrder();
        CheckOrder checkOrder = new CheckOrder();
        System.out.println("""
                ***** 성민카페를 찾아주셔서 감사합니다 *****
                << 메뉴 목록 >>
                (1) 아메리카노
                (2) 카페라떼
                '종료'를 입력하시면 주문이 종료됩니다.
                """);
        while (true) {
            addOrder.addOrder();
        }
    }
}