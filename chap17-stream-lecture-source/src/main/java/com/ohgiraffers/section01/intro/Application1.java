package com.ohgiraffers.section01.intro;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 스트림(Stream)
         * 자바 8버전부터 추가된 기능으로, 컬렉션에 저장된 엘리먼트(요소)들을 하나씩 순회하며 처리할 수 있는 기능이다.
         * 스트림을 이용하면 배열 또는 컬렉션을 함수 여러개를 사용해서 결과를 쉽게 얻을 수 있다.
         * 람다식과 함께 사용될 수 있으며 컬렉션에 들어있는 데이터에 대한 처리를 간결하게 표현할 수 있다.
         * 스트림을 사용하면 람다식을 활용해 코드양이 많이 줄어든다.
         *
         * 스트림의 특징
         * 1. 스트림은 원본 데이터를 변경시키지 않는다.
         * 2. 스트림은 일회용이기 때문에 최종 연산이 일어난 후 다시 스트림을 생성해서 사용해야한다.
         * 3. 스트림은 작업을 내부적으로 반복처리한다.
         * 4. 스트림은 작업을 병렬로 처리할 수 있다. (멀티쓰레드)
         */

        List<String> stringList = new ArrayList<String>(Arrays.asList("e", "a", "d", "b", "d", "c", "a"));
        System.out.println("=============== stream 사용 이전 ===============");
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("=============== stream 사용 이후 ===============");
        stringList.stream().forEach(System.out::println);

        System.out.println("=============== stream 연산 ===============");
        stringList.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        // distinct() : 중복값 제거 / limit() : 매개변수로 넣은 정수만큼 잘라줌
        // sorted() : 오름차순 정렬 / sorted(Comparator.reverseOrder()) : 내림차순 정렬
    }
}
