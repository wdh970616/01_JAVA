package com.ohgiraffers.section2.looping;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class C_Dowhile {

//    * do while문 표현식
//    [초기식];
//    do {
//      (반복할 코드) : 1회차에는 무조건 실행하고 이후에는 조건식을 확인해 만족하는 경우에만 수행
//      [증감식];
//    } while ([조건식])
//

    public void testSimpleDoWhileStatement() {
        do {
            System.out.println("최소 한번은 동작함...");
        } while (false);

        System.out.println("반복문 종료 확인...");
    }

    // 문자열을 입력받아 반복적으로 출력
    // equals() : 문자열은 == 비교가 불가능하다.
    //            String 클래스에서 제공하는 equals() 기능으로 비교가능하다.
    public void testDoWhileExample1() {
        Scanner sc = new Scanner(System.in);
        String word = "";
        do {
            System.out.print("문자열을 입력하세요. : ");
            word = sc.nextLine();
            System.out.println(word);
        } while (!word.equals("exit")); // 논리값 앞에 '!' 붙힐시 결과 반전됨
        System.out.println("프로그램을 종료합니다.");
    }
}
