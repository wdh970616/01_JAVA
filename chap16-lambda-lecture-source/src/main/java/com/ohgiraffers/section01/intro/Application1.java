package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 람다(lambda)식
         * 메소드를 하나의 식(expression)으로 표현한 것
         * 메소드를 람다식으로 표현하면 메소드 이름이 없는 익명함수라고 할 수 있다.
         * 람다식 자체는 알톤조 처치가 개발한 계산법을 기초했다.
         * f(x,y) = x * y
         * 위의 함수를 람다식으로 변경하면 다음과 같다.
         * (x,y) -> x * y
         *
         * 람다 표현식
         * 매개변수가 없는 경우
         * () -> {...}
         *
         * 매개변수가 있는 경우
         * (매개변수, ...) -> {...}
         *
         * 람다식에서 매개변수의 타입은 추론이 가능하기 때문에 명시적으로 작성하지 않아도 된다.
         * 또한, 매개변수가 한 개만 존재하는 경우 ()를 생략할 수 있으며, 실행문이 한줄인 경우 {}는 생략 가능하다.
         */
        /*
         * 인터페이스에 정의된 추상메소드를 활용하는 방법 3가지
         * 1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성 후 사용하는 방법
         * 2. 익명클래스를 활용하여 메소드 정의 후 사용하는 방법
         * 3. 람다식을 활용하는 방법
         */

        // 1. 인터페이스를 구현한 구현체를 이용한 방식
        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합은? " + c1.sumTwoNumber(10, 20));

        // 2. 익명 클래스를 활용한 방식
        Calculator c2 = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println("20과 30의 합은? " + c2.sumTwoNumber(20, 30));

        // 3. 람다식을 활용한 방식
        Calculator c3 = (x, y) -> x + y;
        System.out.println("40과 50의 합은? " + c3.sumTwoNumber(40, 50));
    }
}
