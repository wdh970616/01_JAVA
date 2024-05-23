package com.ohgiraffers.section04.sort;

public class Application2 {
    public static void main(String[] args) {

        // 순차정렬
        // 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 알고리즘

        // 정렬할 배열
        int[] iarr = {2, 5, 4, 6, 1, 3};

        System.out.println("========== 순차정렬하기 전 iarr의 배열 ==========");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {
                // if 문의 부등호 방향을 바꿔서
                // 오름차순 정렬을 내림차순으로 바꿀 수 있다.
                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }

        System.out.println("========== 순차정렬한 후의 iarr의 배열 ==========");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
