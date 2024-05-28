package com.ohgiraffers.subProject2;

public class Barista {
    // 주문에 따라 커피를 만들어야함
    private int coffeeStock = 5000; // 5000g 커피보유

    public Coffee[] makeCoffee(Order order) {
        if (coffeeStock >= (order.getCount() * 20)) {
            // 커피 생성
            Coffee[] coffees = new Coffee[order.getCount()];
            // 보유량 차감
            coffeeStock = coffeeStock - (order.getCount() * 20);

            for (int i = 0; i < coffees.length; i++) {
                coffees[i] = new Coffee(order.getMenuName(), order.getOption());
            }
            return coffees;
        } else {
            System.out.println("[바리스타] : 커피원두를 충전해주세요!");
            return null;
        }
    }
}
