package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book {
    private int accessAge;

    @Override
    public String toString() {
        return super.toString() + "\b | 연령제한 : " + accessAge + "]";
    }

    public AniBook() {
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }
}
