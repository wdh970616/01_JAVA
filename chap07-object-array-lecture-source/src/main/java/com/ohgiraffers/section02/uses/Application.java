package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
         * 여러명의 정보를 받아와서 등록
         * 등록하는 정보를 객체 배열로 저장
         * 객체 배열에 저장된 값을 꺼내서 출력
         */

        /*
         * 시스템 요구사항
         * 1. 여러명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
         * 2. 전체 회원 조회시 여러명의 회원 정보를 반환
         *
         * 제약사항
         * 1. MemberRepository에 static 필드로 회원정보들을 관리한다.
         * 2. 회원정보는 최대 10명까지 지정할 수 있다.
         */

        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("============  회원관리 프로그램  ============");
            System.out.println("(1) 회원 등록");
            System.out.println("(2) 회원 전체 조회");
            System.out.println("(9) 프로그램 종료");
            System.out.print("원하는 기능의 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    memberService.signUpMembers();
                    break;
                case 2:
                    memberService.showAllMembers();
                    break;
                case 9:
                    System.err.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("! 잘못된 번호를 입력하셨습니다 !");
            }
        }
    }
}
