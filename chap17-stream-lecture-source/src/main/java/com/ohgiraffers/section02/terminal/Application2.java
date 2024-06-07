package com.ohgiraffers.section02.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /*
         * reduce
         * 스트림에 있는 모든 요소를 누적시킨다.
         * Optional<T> reduce(BinaryOperator<T> accmulator);
         * T reduce(T identity, BinaryOperator<T> accmulator);
         */

        // 인자가 1개일 경우
        OptionalInt reduceOneParam = IntStream.range(1, 4).reduce(Integer::sum);
//                .reduce((a, b) -> {
//                    return Integer.sum(a, b);
//                });
        System.out.println("reduceOneParam = " + reduceOneParam);
        // 인자가 2개일 경우
        int reduceTwoParam = IntStream.range(1, 4)
                .reduce(100, Integer::sum); // Identity = 시작값, 시작값부터 Stream안의 요소를 누적시켜라는 의미
        System.out.println("reduceTwoParam = " + reduceTwoParam);
    }
}
