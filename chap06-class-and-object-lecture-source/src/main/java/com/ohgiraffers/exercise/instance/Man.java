package com.ohgiraffers.exercise.instance;

public class Man {
    private int age;
    private String name;
    private boolean married;
    private int kids;

    public Man(int age, String name, boolean married, int kids) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.kids = kids;
        System.out.println("========== Man 기본생성자로 호출해보기 ==========");
        System.out.println("나이가 " + age + "살인 '" + name + "'씨는 " + isHeMarried(married) + "이며, " + kids + "명의 자식이 있습니다.");
    }

    public void hisAge(int age) {
        this.age = age;
    }

    public void hisName(String name) {
        this.name = name;
    }

    public String isHeMarried(boolean married) {
        this.married = married;
        return married ? "기혼" : "미혼";
    }

    public void howManyKids(int kids) {
        this.kids = kids;
    }

    public String getHisInfo() {
        return "나이가 " + age + "살인 '" + name + "'씨는 " + isHeMarried(married) + "이며, " + kids + "명의 자식이 있습니다.";
    }
}
