package com.ohgiraffers.subProject;

import java.util.Scanner;

public class Kiosk {

    Scanner sc = new Scanner(System.in);
    Storage storage = new Storage();
    int howManyHotAmericano;
    int howManyIceAmericano;
    int howManyHotLatte;
    int howManyIceLatte;
    int howManyPeachIceTea;
    boolean isHot;

    public void showYourOrder() {
        if (howManyHotAmericano > 0 || howManyIceAmericano > 0 || howManyHotLatte > 0 || howManyIceLatte > 0) {
            System.out.println("지금까지 주문하신 음료는...");
            if (howManyHotAmericano > 0) {
                System.out.println("아메리카노[HOT] '" + howManyHotAmericano + "'잔");
            }
            if (howManyIceAmericano > 0) {
                System.out.println("아메리카노[ICE] '" + howManyIceAmericano + "'잔");
            }
            if (howManyHotLatte > 0) {
                System.out.println("카페라떼[HOT] '" + howManyHotLatte + "'잔");
            }
            if (howManyIceLatte > 0) {
                System.out.println("카페라떼[ICE] '" + howManyIceLatte + "'잔");
            }
            if (howManyPeachIceTea > 0) {
                System.out.println("복숭아 아이스티 '" + howManyPeachIceTea + "'잔");
            }
            System.out.println("입니다.");
        } else {
        }
    }

    public void kiosk() {
        storage.materialSet();
        System.out.println("***** 성민카페를 찾아주셔서 감사합니다 *****");
        System.out.println("< 성민카페 메뉴 목록 >");
        System.out.println("(1) 아메리카노");
        System.out.println("(2) 카페라떼");
        System.out.println("(3) 아이스티");
        while (true) {
            System.out.println("'취소'를 입력하시면 주문을 마치실 수 있습니다.");
            System.out.print("주문하실 음료를 입력해주세요 : ");
            String menu = sc.nextLine();
            if (menu.equals("1") || menu.equals("아메리카노")) {
                if (storage.coffeeBeans > 0) {
                    System.out.println("===== 아메리카노를 선택하셨습니다 =====");
                    System.out.println("(1) HOT (핫)");
                    System.out.println("(2) ICE (아이스)");
                    System.out.print("둘 중 옵션을 골라 입력해주세요 : ");
                    while (true) {
                        String isHot = sc.nextLine();
                        if (isHot.equals("1") || isHot.equals("HOT") || isHot.equals("hot") || isHot.equals("핫")) {
                            this.isHot = true;
                            while (true) {
                                System.out.println("현재 주문 가능한 수량은 [" + storage.coffeeBeans + "]잔 입니다.");
                                System.out.print("주문하실 잔 수를 입력해주세요 : ");
                                howManyHotAmericano = sc.nextInt();
                                if (howManyHotAmericano > 0 && howManyHotAmericano <= storage.coffeeBeans) {
                                    while (true) {
                                        System.out.println("=== 아메리카노[HOT] '" + howManyHotAmericano + "'잔을 선택하셨습니다 ===");
                                        System.out.println("주문이 맞으십니까?");
                                        System.out.println("(1) 예");
                                        System.out.println("(2) 아니오");
                                        System.out.println("주문이 맞으시면 '예', 틀리거나 다시 주문하시려면 '아니오'를 입력해주세요.");
                                        String isYourOrderRight = sc.nextLine();
                                        if (isYourOrderRight.equals("1") || isYourOrderRight.equals("예") || isYourOrderRight.equals("네") || isYourOrderRight.equals("ㅇㅇ")) {

                                        } else if (isYourOrderRight.equals("2") || isYourOrderRight.equals("아니오") || isYourOrderRight.equals("ㄴㄴ")) {

                                        } else {
                                            System.out.println("! 잘못 입력하셨습니다 !");
                                        }
                                    }
                                } else {
                                    System.out.println("! 수량을 잘못 입력하셨습니다 !");
                                }
                            }
                        }
                        if (isHot.equals("2") || isHot.equals("ICE") || isHot.equals("ice") || isHot.equals("아이스")) {
                            this.isHot = false;
                            System.out.print("주문하실 잔 수를 입력해주세요 : ");
                        } else {
                            System.out.println("! 옵션을 잘못 입력하셨습니다. 다시 입력해주세요. !");
                        }
                    }
                } else {
                    System.out.println("! 현재 재고 소진으로 인해 아메리카노는 주문이 불가능합니다. 죄송합니다. !");
                }
            } if (menu.equals("종료")) {
                break;
            } else {
                System.out.println("! 잘못 입력하셨습니다 !");
            }
        }
        System.err.println("성민카페를 이용해주셔서 감사합니다! 또 방문해주세요.");
    }
}
