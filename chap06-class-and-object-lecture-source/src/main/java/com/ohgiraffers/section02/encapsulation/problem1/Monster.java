package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

//    String name;    // 몬스터 이름
//    int hp; // 몬스터 체력

    // hp에 음수가 저장되는 것을 막고자 hp가 양수인 경우에만 입력하는 hp로 변경하고
    // 0보다 작은 경우 0으로 변경할 수 있도록 기능

    String name;
    int hp;

    public void setHp(int hp) {
        /*
         * this는 인스턴스가 생성되었을때 자신의 주소를 저장하는 래퍼런스 변수이다.
         * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
         * 전역변수에 접근하기 위해서 this. 를 명시해야한다.
         */
        if (hp > 0) {
            System.out.println("몬스터의 체력이 정상적으로 변경되었습니다.");
            this.hp = hp;    // 지역변수는 해당 지역변수를 우선시함
        } else {
            System.out.println("0 이하의 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp = 0;
        }
    }
}
