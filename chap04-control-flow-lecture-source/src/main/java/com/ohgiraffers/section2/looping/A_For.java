package com.ohgiraffers.section2.looping;

import java.util.Scanner;

public class A_For {

    public void testSimpleForStatement() {

//        * for문 표현식
//         for([초기식]; [조건식]; [증감식]) {
//           (조건을 만족할 경우 수행할 구문)
//         }

//     * 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testExample0() {

        /*
         * "안녕하세요" 를 5번 출력하기
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세요");
        }
    }

    public void testForExample1() {
        // 10명의 학생 이름을 입력받아 이름을 출력 해보자

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요. : ");
            String name = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 '" + name + "'입니다.");
        }
    }

    public void testExample2() {
//        * 1 ~ 10 까지의 합계를 구하시오.

        int total = 0;
        for (int num = 1; num <= 10; num++) {
            total += num;
        }
        System.out.println(total);
    }

    /*
     * 5 ~ 10 사이의 난수를 발생시켜서
     * 1부터 발생한 난수까지의 합계를 구해보자.
     */
    public void testExample3() {

        int random = (int) (Math.random() * 6) + 5;
        System.out.println("발생한 난수 = " + random);
        int total = 0;
        for (int num = 1; num <= random; num++) {
            total += num;
        }
        System.out.println("1에서 " + random + "까지의 합 = " + total);
    }

    /* 혼자서 만들어보기
     * 두 개의 숫자를 입력받아서 작은 수에서 큰 수 까지의 합계를 구하세요.
     * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 조건.
     */
    public void testExample4() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요. : ");
        int num2 = sc.nextInt();
        int total = 0;

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                total += i;
            }
            System.out.println(num1 + "부터 " + num2 + "까지의 합은 " + total + "입니다.");
        }
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                total += i;
            }
            System.out.println(num2 + "부터 " + num1 + "까지의 합은 " + total + "입니다.");
        } else {
            System.out.println("서로 다른 두 숫자를 입력해주세요.");
        }
    }

    public void printSimpleGugudan() {

        /*
         * 키보드로 2 ~ 9 사이의 구구단을 입력받아
         * 2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고,
         * 그렇지 않은 경우 "반드시 2에서 9사이의 양수를 입력해야 합니다." 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 출력하실 단 수를 입력해주세요. : ");
        int dan = sc.nextInt();
        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " 곱하기 " + i + " 은(는) " + (dan * i));
            }
        } else {
            System.out.println("반드시 2에서 9사이의 양수를 입력해야 합니다. 다시 시도해주세요.");
        }
    }
}
