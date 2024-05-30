package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

public class Application1 {
    public static void main(String[] args) {
        // extends : 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다.

        /*
         * extends 키워드를 이용하여 특정 타입만 사용하도록 범위 지정
         * -> 지정한 특정 타입과 함께 특정 타입의 자식 타입들도 대입 가능
         */

        // Animal 타입은 Rabbit의 후손이 아니기 때문에, 제네릭클래스 인스턴스 생성이 불가
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>(); // Mammal과 Snake도 마찬가지
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();    // animal의 타입? -> Rabbit

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();    // animal의 타입? -> Bunny

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();    // animal의 타입? -> DrunkenBunny

    }
}
