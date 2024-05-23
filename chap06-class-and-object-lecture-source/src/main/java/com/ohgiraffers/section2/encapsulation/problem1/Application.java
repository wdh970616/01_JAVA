package com.ohgiraffers.section2.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
        monster1.name = "고니";
        monster1.hp = 200;
        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);
        System.out.println();

        Monster monster2 = new Monster();
        monster2.name = "강욱";
        // 어이쿠 실수
        monster2.hp = -200;
        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
        System.out.println();

        Monster monster3 = new Monster();
        monster3.name = "우민";
        monster3.setHp(150);    // hp가 150으로 설정, 안내문구 출력
        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
        System.out.println();

        Monster monster4 = new Monster();
        monster4.name = "주누";
        monster4.setHp(-1000);  // hp가 0으로 설정, 안내문구 출력
        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);
    }
}
