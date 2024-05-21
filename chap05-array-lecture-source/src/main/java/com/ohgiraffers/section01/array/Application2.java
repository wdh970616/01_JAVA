package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 배열의 사용 방법
         *
         * 1. 배열의 선언
         * 2. 배열의 할당(초기화)
         * 3. 배열의 인덱스 공간에 값 대입
         */

        /*
         * 배열의 선언
         *
         * 자료형[] 변수명;
         * 자료형 변수명[];
         */

        // stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것
        int[] iarr;
        char carr[];

        /*
         * 선언한 래퍼런스 변수에 배열을 할당하여 대입할 수 있다.
         * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
         * 발생한 주소를 래퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에 참조자료형 이라고 한다. (String도 이것과 같은 원리)
         */

        // 배열의 할당을 할 시에는 반드시 배열의  크기를 지정해주어야한다.
        // iarr = new int[]; -> 크기를 지정해주지 않아서 에러가 발생
        // iarr = new char[5]; -> 자료형 타입이 맞지 않아 에러가 발생

        iarr = new int[5];
        carr = new char[5];

        // 선언과 할당을 동시에 할 수 있다.
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];
        long[] larr = new long[5];

        System.out.println("iarr2 : " + iarr2);
        System.out.println("carr2 : " + carr2);
        System.out.println("larr : " + larr);   // 각 배열의 주소가 출력됨

        /*
         * hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환
         * -> 동일객체인지 비교할 때 사용할 목적으로 많이 쓰이며, 동등객체를 동일객체 취급하기 위한 용도로 overring해서 사용한다.
         */

        System.out.println("iarr2의 hashcode : " + iarr2.hashCode());
        System.out.println("carr2의 hashcode : " + carr2.hashCode());

        // 배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다.
        System.out.println("iarr2의 길이 : " + iarr2.length);
        System.out.println("carr2의 길이 : " + carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요. : ");
        int size = sc.nextInt();
        double[] darr = new double[size];
        System.out.println("darr의 hashcode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        // 한 번 지정한 배열의 크기는 변경하지 못한다.
        darr = new double[30];
        System.out.println("변경된 darr의 hashcode : " + darr.hashCode());
        System.out.println("변경된 darr의 길이 : " + darr.length);
        // 배열의 사이즈만 변경하는 것이 아닌, 새로운 배열을 생성해서 그 주소값을 래퍼런스 변수에 덮어 쓴 것이다.
        // 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조가 불가능하다.
        darr = null;
        System.out.println("삭제 후 darr의 길이 : " + darr.length);
    }
}
