package com.ohgiraffers.subProject;

public class Barista {

    Storage storage = new Storage();
    Kiosk kiosk = new Kiosk();

    public void makeAmericano() {
        if (kiosk.isHot) {
            if(storage.coffeeBeans - kiosk.howManyHotAmericano > 0) {
                storage.coffeeBeans -= kiosk.howManyHotAmericano;
                System.out.println("바리스타 : (원두가 " + storage.coffeeBeans + "잔 분량 남았네)");
            } else {
                storage.coffeeBeans -= kiosk.howManyHotAmericano;
                System.out.println("바리스타 : (원두가 다 떨어졌네!)");
            }
        } else {
            storage.coffeeBeans -= 1;
        }
    }
}
