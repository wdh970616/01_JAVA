package com.ohgiraffers.section2.looping;

import java.util.Scanner;

public class B_While {

//   * while문 표현식
//
//   (초기식)
//
//   while([조건식]) {
//      (조건을 만족하는 경우 수행할 구문-반복될 코드)
//      [증감식];
//      }

    public void testSimpleWhileStatement() {
        // 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // 10부터 1씩 감소 시키면서 i값을 출력하는 반복문 작성하기
    public void testSimpleWhileStatement2() {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }

    // 입력한 문자열의 인덱스를 이용해서 문자 하나씩 출력해보기
    // charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
    // length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환하는 기능
    public void testWhileExample1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요. : ");
        String word = sc.nextLine();
        System.out.println("==========  for문 ==========");
        for (int i = 0; i < word.length(); i++) {
            System.out.println((i + 1) + "번째 단어 : " + word.charAt(i));
        }

        System.out.println("========== while 문 ==========");
        int i2 = 1;
        System.out.print("문자열을 입력해주세요. : ");
        String word2 = sc.nextLine();
        while (i2 <= word2.length()) {
            char ch = word2.charAt(i2);
            System.out.println((i2 + 1) + "번째 단어 : " + ch);
            i2++;
        }
    }

    // 정수 하나를 입력받아 1부터 입력받은 정수까지의 합계를 구한다.
    public void testWhileExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력해주세요. : ");
        int num = sc.nextInt();

        int i = 1;
        int total = 0;
        while (i <= num) {
            total += i;
            i++;
        }
        System.out.println("1부터 " + num + "까지의 정수의 합은 " + total + "입니다.");
    }

    // 중첩 while
    // 중첩 while을 이용해 구구단 출력하기
    public void testWhileExample3() {
        int dan = 2;
        while (dan < 10) {
            int su = 1;
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++;
            }
            System.out.println();
            dan++;
        }
    }
}
