package com.ohgiraffers.section02.demensinal;

public class Application4 {
    public static void main(String[] args) {

        /*
         * 가변 배열도 할당과 동시에 블록을 이용해서 초기화가 가능하다.
         */

        // 정변 배열의 블록 이용 초기화
        System.out.println("========== 정변 배열 ==========");
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < iarr.length; i++) {
            System.out.print("iarr[" + i + "]의 배열 : ");
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        // 가변 배열의 블록 이용 초기화
        System.out.println("========== 가변 배열 ==========");
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        for (int i = 0; i < iarr2.length; i++) {
            System.out.print("iarr2[" + i + "]의 배열 : ");
            for (int j = 0; j < iarr2[i].length; j++) {
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }

        // 미리 할당한 배열을 이용
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[][] iarr3 = {arr1, arr2};   // 미리 할당한 배열을 블록을 사용하여 할당해줌
        System.out.println("========== 미리 할당한 배열을 이용한 방식 ==========");
        for (int i = 0; i < iarr3.length; i++) {
            System.out.print("iarr3[" + i + "]의 배열 : ");
            for (int j = 0; j < iarr3[i].length; j++) {
                System.out.print(iarr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
