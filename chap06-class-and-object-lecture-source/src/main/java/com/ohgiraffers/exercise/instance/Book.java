package com.ohgiraffers.exercise.instance;

public class Book {

    private String writer;
    private String title;
    private String cover;
    private int page;

    public Book(String writer, String title, String cover, int page) {
        this.writer = writer;
        this.title = title;
        this.cover = cover;
        this.page = page;
        System.out.println("========== Book의 기본생성자로 호출해보기 ==========");
        System.out.println(writer + "가 쓴 책 '" + title + "'는 " + cover + "커버이며, 총 " + page + "페이지이다.");
    }

    public void bookWriter(String writer) {
        this.writer = writer;
    }

    public void bookTitle(String title) {
        this.title = title;
    }

    public void bookCover(String cover) {
        this.cover = cover;
    }

    public void bookPage(int page) {
        if (page > 0) {
            this.page = page;
        } else {
            this.page = Math.abs(page);
        }
    }

    public String getBookInfo() {
        return writer + "가 쓴 책 '" + title + "'은(는) " + cover + "커버이며, 총 " + page + "페이지이다.";
    }
}
