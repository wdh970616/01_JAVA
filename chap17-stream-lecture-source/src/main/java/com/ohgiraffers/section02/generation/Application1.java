package com.ohgiraffers.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        // 배열과 컬렉션 개체의 stream() 메소드를 활용한 스트림 생성

        String[] sarr = new String[]{"java", "oracle", "jdbc"};
        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);
        System.out.println();

        // 배열의 일부분(0번 인덱스 ~ 2번 인덱스 이전)을 스트림으로 변환
        System.out.println("=============== 일부분만 스트림으로 변환 ===============");
        Stream<String> strStream2 = Arrays.stream(sarr, 0, 2);
        strStream2.forEach(System.out::println);
        System.out.println();

        System.out.println("=============== List를 스트림으로 변환 ===============");
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> strStream3 = stringList.stream();
        strStream3.forEach(System.out::println);
        System.out.println();

        // 컬렉션의 경우 스트림 생성을 생략하고 사용가능
        System.out.println("=============== List를 바로 forEach()로 출력 ===============");
        stringList.forEach(System.out::println);
        System.out.println();

        // Builder를 활용한 스트림 생성
        System.out.println("=============== Builder를 활용한 스트림 생성 ===============");
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길").build();
        builderStream.forEach(System.out::println);
    }
}
