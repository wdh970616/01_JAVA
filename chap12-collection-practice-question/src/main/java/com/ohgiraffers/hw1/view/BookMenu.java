package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        while (true) {
            System.out.print("""
                    *** 도서 관리 프로그램 ***
                      1. 새 도서 추가
                      2. 도서정보 정렬 후 출력
                      3. 도서 삭제
                      4. 도서 검색출력
                      5. 도서 전체출력
                      6. 끝내기
                    """);
            System.out.print("원하시는 기능의 번호를 입력하세요 : ");
            String menu = sc2.nextLine();
            switch (menu) {
                case "1":
                    bm.addBook(inputBook());
                    break;
                case "2":
                    int select = 0;
                    do {
                        System.out.print("정렬방식을 선택해주세요(1. 오름차순 | 2. 내림차순) : ");
                        select = sc.nextInt();
                        switch (select) {
                            case 1:
                                bm.sortedBookList(select);
                                break;
                            case 2:
                                bm.sortedBookList(select);
                                break;
                            default:
                                System.out.println("번호를 잘못 입력하셨습니다.");
                                break;
                        }
                    } while (!(select == 1 || select == 2));
                case "3":
                    bm.displayAll();
                    System.out.print("삭제하실 도서의 번호를 입력해주세요 : ");
                    int index = sc.nextInt() - 1;
                    bm.deleteBook(index);
                    break;
                case "4":
                    int result = bm.searchBook(inputBookTitle());
                    if (result == -1) {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        bm.printBook(result);
                    }
                    break;
                case "5":
                    bm.displayAll();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호를 입력해주세요 : ");
        int bNo = sc.nextInt();
        System.out.print("도서 제목을 입력해주세요 : ");
        String title = sc2.nextLine();
        System.out.print("도서 장르 번호를 입력해주세요(1.인문 | 2.자연과학 | 3. 의료 | 4. 기타) : ");
        int category = sc.nextInt();
        System.out.print("도서 저자를 입력해주세요 : ");
        String author = sc.next();
        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
}
