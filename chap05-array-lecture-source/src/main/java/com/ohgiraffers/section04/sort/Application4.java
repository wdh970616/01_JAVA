package com.ohgiraffers.section04.sort;

public class Application4 {
    public static void main(String[] args) {

        // 버블정렬

        /*
         * 인접한 두 개의 숫자를 검사하여 정렬하는 방법
         * 구현이 쉽다는 장점이 있으며, 이미 어느정도 정렬된 데이터를 정렬할 때 빠름
         */
        // {6, 5, 4, 3, 2, 1} 이렇게 역순으로 되어있을때, 모든 교환을 실행해야 하기 때문에 많이 느려진다.

        int temp;

        int[] iarr = {2, 5, 4, 6, 1, 3};
        System.out.println("========== 버블정렬 하기전 iarr의 배열 ==========");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

//        for (int i = iarr.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (iarr[j] > iarr[j + 1]) {
//                    temp = iarr[j];
//                    iarr[j] = iarr[j + 1];
//                    iarr[j + 1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < iarr.length; i++) {
            for (int j = iarr.length - 1; j > i; j--) {
                // 버블정렬 역시 if문의 부등호 방향을 바꿔주면
                // 오름차순에서 내림차순으로 변경 가능
                if (iarr[j] < iarr[j - 1]) {
                    temp = iarr[j];
                    iarr[j] = iarr[j - 1];
                    iarr[j - 1] = temp;
                }
            }
        }

        System.out.println("========== 버블정렬 후의 iarr의 배열 ==========");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
