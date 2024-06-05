package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
        System.out.println("추가가 완료되었습니다.");
    }

    public void deleteBook(int index) {
        if(bookList.get(index) == null) {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        } else {
            System.out.println(bookList.get(index).getTitle() + "의 삭제가 완료되었습니다.");
            bookList.remove(index);
        }
    }

    public int searchBook(String title) {
        if (bookList.indexOf(title) == -1) {
            System.out.println("해당하는 도서가 존재하지 않습니다.");
            return 0;
        } else {
            return bookList.indexOf(title);
        }
    }

    public void printBook(int index) {
        if (bookList.get(index) == null) {
            System.out.println("해당 순번의 도서가 없습니다.");
        } else {
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            System.out.println();
            for(int i = 0; i < bookList.size(); i++) {
                System.out.println((i+1) + "번 도서 " + bookList.get(i));
            }
            System.out.println();
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        if (!(bookList.isEmpty())) {
            if (select == 1) {
                bookList.sort(new AscCategory());
            } else if (select == 2) {
                bookList.sort(new DescCategory());
            }
            return bookList;
        } else {
            System.out.println("출력할 도서가 없습니다.");
            return null;
        }
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}
