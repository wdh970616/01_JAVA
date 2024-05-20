package com.ohgiraffers.section2.looping;

import java.util.Scanner;

public class A_NestedFor {

    // 중첩 for문
    // for문 안에 for문이 있는 것을 의미
    public void printGugudanFromTwoToNine() {

        // 구구단 전체를 출력하는 기능
        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "단 입니다.");
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + "곱하기 " + su + "는 " + (dan * su));
            }
            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        for (int dan = 2; dan < 10; dan++) {
            printGugudanOf(dan);
            System.out.println();
        }
    }

    // 한 단씩 구구단을 출력하는 메소드
    public void printGugudanOf(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStar(int row) {
        for (int i = 1; i <= row; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //    * 정수를 하나 입력받아 정수만큼 한 행에 "*"을 5개씩 출력하세요.
    public void printStarInputRowTimes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            printStar(row);
        }
    }

    public void printTriangleStars() {
//        키보드로 정수를 하나 입력받아, 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("기본 별찍기 : 몇 행을 출력하시겠습니까? ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printReverseTriangleStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("역방향 별찍기 : 몇 행을 출력하시겠습니까? ");
        int row = sc.nextInt();
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printSymmetryTriangleStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌우대칭 별찍기 : 몇 행을 출력하시겠습니까? ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            for (int k = row - i; k < row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPyramidStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("피라미드 별찍기 : 몇 행을 출력하시겠습니까? ");
        int row = sc.nextInt();
        {
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (i * 2) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void printHourglassStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("모래시계 별찍기 : 모래가 떨어지는 높이를 몇 행으로 출력하시겠습니까? ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            if (i == row) {
                break;
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((row - i) * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
