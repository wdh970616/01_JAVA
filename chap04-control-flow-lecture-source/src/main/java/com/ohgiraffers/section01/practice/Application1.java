package com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Application1 app1 = new Application1();
//        app1.canYouRide();
        app1.testResult();

    }

    public void canYouRide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("탑승자의 나이를 입력해주세요. : ");
        int age = sc.nextInt();
        System.out.print("탑승자의 키를 입력해주세요.(cm) : ");
        int height = sc.nextInt();

        if (age < 9 && height >= 110) {
            System.out.println("나이가 9살 미만이라 탑승 하실 수 없습니다.");
        }
        if (age >= 9 && height < 110) {
            System.out.println("키가 110cm 미만이라 탑승 하실 수 없습니다.");
        }
        if (age >= 9 && height >= 110) {
            System.out.println("놀이기구를 탑승 하실 수 있습니다.");
        }
        if (age < 9 && height < 9) {
            System.out.println("나이가 9살 미만이고, 키가 110cm 미만이라 탑승 하실 수 없습니다.");
        }
    }

    public void testResult() {
        Scanner sc = new Scanner(System.in);

        System.out.print("영어시험 점수를 입력해주세요. : ");
        int englishScore = sc.nextInt();
        System.out.print("수학시험 점수를 입력해주세요. : ");
        int mathScore = sc.nextInt();

        if (englishScore >= 0 && mathScore >= 0 && englishScore <= 100 && mathScore <= 100) {
            if (englishScore >= 40 && mathScore >= 40) {
                if ((englishScore + mathScore) / 2 >= 60) {
                    System.out.println("시험 합격");
                } else {
                    System.out.println("시험 불합격");
                }
            } else {
                System.out.println("한 과목 과락으로 인한 시험 불합격");
            }
        } else {
            System.out.println("점수를 잘못 입력하셨습니다. 다시 시도해주세요.");
        }
    }
}
