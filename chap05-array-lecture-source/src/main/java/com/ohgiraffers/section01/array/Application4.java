package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
         * 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램
         */

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;

//        System.out.println("========== 학생 " + scores.length + "명의 평균 구하기 ==========");
//        for (int i = 0; i < scores.length; i++) {
//            System.out.print((i + 1) + "번째 학생의 점수를 입력해주세요. : ");
//            scores[i] = sc.nextInt();
//            avg += scores[i];
//            if (i == (scores.length - 1)) {
//                System.out.println("학생 " + scores.length + "명의 점수합계는 " + (int)avg + "점,");
//                System.out.println("학생 " + scores.length + "명의 점수평균은 " + (avg / scores.length) + "점 입니다.");
//            }
//            if (scores[i] < 0 || scores[i] > 100) {
//                System.out.println("점수를 잘못 입력하셨습니다. 다시 시도해주세요.");
//                break;
//            }
//        }

        System.out.println("========== 학생 " + scores.length + "명의 평균 구하기 (do-while) ==========");
        for (int i = 0; i < scores.length; i++) {
            do {
                System.out.print((i + 1) + "번째 학생의 점수를 입력해주세요. : ");
                scores[i] = sc.nextInt();
                avg += scores[i];
                if (scores[i] < 0 || scores[i] > 100) {
                    System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
                }
            } while (scores[i] < 0 || scores[i] > 100);
        }
        System.out.println("학생 " + scores.length + "명의 점수합계는 " + (int) avg + "점,");
        System.out.println("학생 " + scores.length + "명의 점수평균은 " + (avg / scores.length) + "점 입니다.");
    }
}
