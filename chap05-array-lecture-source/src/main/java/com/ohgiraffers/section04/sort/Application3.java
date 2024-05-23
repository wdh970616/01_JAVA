package com.ohgiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {

        // 선택정렬

        /*
         * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
         * 데이터의 양이 적을 때 좋은 성능을 나타낸다. (교환횟수가 적음)
         * 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에
         * 100개 이상의 자료에서는 급격하게 속도가 저하된다.
         */

        System.out.println("========== 선택정렬 하기전 iarr의 배열 ==========");
        int[] iarr = {2, 5, 4, 6, 1, 3};
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        int min;    // 최소값을 가진 데이터의 인덱스 저장
        int temp;

        for (int i = 0; i < iarr.length; i++) {
            min = i;
            // 해당 인덱스의 다음 인덱스부터 끝까지 반복
            // min값의 인덱스를 찾는다.
            for (int j = i + 1; j < iarr.length; j++) {
                // if문의 부등호 방향을 바꿔서
                // 오름차순을 내림차순으로 변경 가능
                if (iarr[min] > iarr[j]) {
                    min = j;
                }
            }
            // 찾은 인덱스를 왼쪽에서부터 값을 교환해준다.
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
        }
        System.out.println("========== 선택정렬 후의 iarr의 배열 ==========");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
