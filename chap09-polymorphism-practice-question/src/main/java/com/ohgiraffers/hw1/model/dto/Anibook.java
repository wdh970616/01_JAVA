package com.ohgiraffers.hw1.model.dto;

public class Anibook extends Book {
    private int accessAge;

    @Override
    public String toString() {
        return "Anibook{" +
                "accessAge=" + accessAge +
                '}';
    }

    public Anibook() {
    }

    public Anibook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }
}
