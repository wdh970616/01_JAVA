package com.ohgiraffers.section03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 메소드참조
         * 함수형 인터페이스를 람다식으로 쓰는게 아닌, 일반 메소드를 참조시켜 선언하는 방법
         * 일반 메소드를 참조하기 위해서는 함수형 인터페이스와 메소드의 (매개변수 타입/갯수/반환형)이 같아야한다.
         * [메소드 참조 표현식]
         * 클래스이름::메소드이름
         * 참조변수이름::메소드이름
         */

        // BiFunction<T, U, R> : R : 객체 T, U를 R로 매핑
        // String, String 문자열 두개를 받아서 equals로 비교를 해서 결과를 Boolean 형태로 return
        BiFunction<String, String, Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("java", "oracle"));
        System.out.println();

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("사용할까요?");
        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");
        System.out.println();

        forEach(subjects, System.out::println);
    }

    // 반복할 객체 리스트를 받고, Consumer를 이용해서 무언가를 출력할 용도.
    private static void forEach(List<? extends Object> list, Consumer<Object> consumer) {
        for (Object obj : list) {
            consumer.accept(obj);
        }
    }
}
