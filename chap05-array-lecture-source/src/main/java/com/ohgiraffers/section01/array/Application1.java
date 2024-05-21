package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 배열이란?
         *
         * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
         * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
         */

        /*
         * 배열의 사용이유
         *
         * 배열을 사용하지 않으면 -> 변수를 여러개 사용해야한다. -> 모든 변수의 이름을 사용자가 관리해야함.
         * 1. 연속된 메모리 공간으로 관리할 수 있다.
         * 2. 반복문을 이용해 연속 처리가 가능하다.
         */

        // 변수 5개를 선언하고 값을 저장
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum : " + sum);

        int[] arr = new int[5];
//        arr[0] = 10;    // 인덱스는 0번부터 시작
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;    // 배열의 마지막번 = (인덱스크기 - 1)

        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {   // 인덱스는 0번부터 시작하기 때문에 i를 0으로 설정해준 모습
            sum2 = sum2 + arr[i];
        }
        System.out.println("sum2 : " + sum2);
    }
}
