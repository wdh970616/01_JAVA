package com.ohgiraffers.section02.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /*
         * match
         *
         * boolean anyMatch(predicate<? super T> predicate); // 하나라도 조건을 만족하는 값이 있는지
         * boolean allMatch(predicate<? super T> predicate); // 모든 값이 조건을 만족하는지
         * boolean noneMatch(predicate<? super T> predicate);    // 모든 값이 조건을 만족하지 않는지
         */

        List<String> stringList = Arrays.asList("Java", "Spring", "SpringBoot");

        // 하나라도 조건을 만족하는 값이 있는지 확인
        boolean anMatch = stringList.stream().anyMatch(str -> str.contains("p"));
        System.out.println("anMatch = " + anMatch);

        // 모든 값이 조건을 만족하는지
        boolean allMatch = stringList.stream().allMatch(str -> str.length() >= 4);
        System.out.println("allMatch = " + allMatch);

        // 모든 값이 조건을 만족하지 않는지
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("c"));
        System.out.println("noneMatch = " + noneMatch);
    }
}
