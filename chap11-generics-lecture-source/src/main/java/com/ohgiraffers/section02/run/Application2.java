package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

public class Application2 {
    public static void main(String[] args) {
        // 와일드카드(wildCard)

        /*
         * 와일드카드
         * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
         *
         * <?> : 제한 없음
         * <? extends [ Type]> : 와일드카드의 상한 제한
         *                      Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능
         * <? super [Type]> : 와일드카드의 하한 제한
         *                    Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능
         */

        WildcardFarm wildcardFarm = new WildcardFarm();

        // 매개변수의 타입 제한이 없는 경우

        // 토끼농장 생성자체가 불가능하면 매개변수로 사용 불가능
//        wildcardFarm.anyType(new RabbitFarm<>(new Mammal()));
//        wildcardFarm.anyType(new RabbitFarm<>(new Reptile()));

        System.out.println("=============== <?> ===============");
        // RabbitFarm을 만들수있다면 <?>에서는 제한없이 모두 매개변수로 사용가능
        wildcardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildcardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildcardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        System.out.println();

        System.out.println("=============== <? extends Bunny> ===============");
        // extends Bunny이기 때문에  Bunny이거나 Bunny의 후손만 매개변수로 사용 가능
        // = 상위타입은 매개변수로 사용 불가
//        wildcardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildcardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildcardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        System.out.println();

        System.out.println("=============== <? super Bunny> ===============");
        // extends Bunny의 <? super>이기때문에 Bunny이거나 Bunny의 상위타입만 사용 가능
        // = 후손타입은 매개변수로 사용 불가
        wildcardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildcardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildcardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    }
}
