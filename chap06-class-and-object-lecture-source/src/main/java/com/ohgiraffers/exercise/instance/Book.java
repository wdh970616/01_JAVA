package com.ohgiraffers.exercise.instance;

public class Book {

    private String writer;
    private String title;
    private String cover;
    private int page;

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
        return writer + "가 쓴 책 '" + title + "'는 " + cover + "커버이며, 총 " + page + "페이지이다.";
    }
}
