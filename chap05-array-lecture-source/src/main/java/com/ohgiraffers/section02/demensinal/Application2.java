package com.ohgiraffers.section02.demensinal;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 이차원 배열(정변 배열)의 선언
         *
         * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
         */

        int[][] iarr = new int[3][5];

//        iarr[0][0] = 1;
//        iarr[0][1] = 2;
//        iarr[0][2] = 3;
//        iarr[0][3] = 4;
//        iarr[0][4] = 5;
//
//        iarr[1][0] = 6;
//        iarr[1][1] = 7;
//        iarr[1][2] = 8;
//        iarr[1][3] = 9;
//        iarr[1][4] = 10;
//
//        iarr[2][0] = 11;
//        iarr[2][1] = 12;
//        iarr[2][2] = 13;
//        iarr[2][3] = 14;
//        iarr[2][4] = 15;

        System.out.print("0번째 인덱스 배열의 기본값 : ");
        System.out.print(iarr[0][0] + " ");
        System.out.print(iarr[0][1] + " ");
        System.out.print(iarr[0][2] + " ");
        System.out.print(iarr[0][3] + " ");
        System.out.print(iarr[0][4] + " ");
        System.out.println();

        System.out.print("1번째 인덱스 배열의 기본값 : ");
        System.out.print(iarr[1][0] + " ");
        System.out.print(iarr[1][1] + " ");
        System.out.print(iarr[1][2] + " ");
        System.out.print(iarr[1][3] + " ");
        System.out.print(iarr[1][4] + " ");
        System.out.println();

        System.out.print("2번째 인덱스 배열의 기본값 : ");
        System.out.print(iarr[2][0] + " ");
        System.out.print(iarr[2][1] + " ");
        System.out.print(iarr[2][2] + " ");
        System.out.print(iarr[2][3] + " ");
        System.out.print(iarr[2][4] + " ");
        System.out.println();

        System.out.println("========== for 구문을 이용하여 값을 대입한 후의 배열 ==========");
        int num = 1;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.print("iarr[" + i + "]의 배열 : ");
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
