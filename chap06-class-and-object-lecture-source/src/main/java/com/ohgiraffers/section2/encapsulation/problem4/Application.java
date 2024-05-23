package com.ohgiraffers.section2.encapsulation.problem4;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();

//        monster1.kinds = "프랑켄슈타인";
//        monster1.hp = 200;     private로 접근제한되어있어 직접 접근할 시 컴파일 에러

        /*
         * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
         * public으로 접근을 허용한 메소드만 이용할 수 있게 해놓은 것
         * => 캡슐화(encapsulation)
         */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);
        System.out.println(monster1.getInfo());

        /*
         * 클래스 작성 시, 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용된다.
         */
    }
}
