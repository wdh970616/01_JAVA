package com.ohgiraffers.subProject;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Kiosk {

    private Barista barista = new Barista();
    private Scanner sc = new Scanner(System.in);

    public void kiosk() {
        System.out.println("""
                ***** 성민카페를 찾아주셔서 감사합니다 *****
                << 메뉴 목록 >>
                (1) 아메리카노
                (2) 라떼
                주문하실 메뉴를 입력해주세요 : """);
    }
}