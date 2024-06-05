package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    protected Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("==== 회원 등록을 시작합니다 ====");
        System.out.print("성함을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("성별을 입력해주세요 (남 / 여): ");
        char gender = sc.next().charAt(0);
        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);
        System.out.println("==== 등록이 완료되었습니다 ====");
        System.out.print("""
                 성민 도서관에 오신것을
                * * 환 영 합 니 다 * *""");
        while (true) {
            System.out.print("""
                       \n
                       ==== 메뉴 ====
                      1. 마이페이지
                      2. 도서 전체 조회
                      3. 도서 검색
                      4. 도서 대여하기
                      0. 프로그램 종료
                    """);
            System.out.print("원하시는 기능의 번호를 입력해주세요 : ");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println();
                    System.out.println(lm.myInfo().toString());
                    break;
                case "2":
                    System.out.println();
                    selectAll();
                    break;
                case "3":
                    System.out.println();
                    new LibraryMenu().searchBook();
                    break;
                case "4":
                    System.out.println();
                    rentBook();
                    break;
                case "0":
                    System.err.println("프로그램을 종료합니다. 안녕히가세요!\n");
                    return;
                default:
                    System.err.print("! 잘못 입력하셨습니다 !");

            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        System.out.println("==== 전체 도서 목록 ====");
        for (int i = 0; i < bList.length; i++) {
            System.out.println((i + 1) + "번도서 " + bList[i].toString());
        }
    }

    public void searchBook() {
        System.out.print("검색할 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        for (Book b : lm.searchBook(keyword)) {
            if (b != null)
                System.out.println(b.toString());
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여하실 도서의 번호를 입력하세요 : ");
        int index = sc.nextInt() - 1;
        int result = lm.rentBook(index);
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        }
        if (result == 1) {
            System.out.println("나이제한으로 인해 대여가 불가합니다.");
        }
        if (result == 2) {
            System.out.println("성공적으로 대여되었습니다.");
            System.out.println("요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요!");
        }
    }
}
