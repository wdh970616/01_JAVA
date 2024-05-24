package com.ohgiraffers.exercise.instance;

public class Man {
    private int age;
    private String name;
    private boolean married;
    private int kids;

    public void hisAge(int age) {
        this.age = age;
    }

    public void hisName(String name) {
        this.name = name;
    }

    public String isHeMarried(boolean married) {
        this.married = married;
        return married? "기혼" : "미혼";
    }

    public void howManyKids(int kids) {
        this.kids = kids;
    }

    public String getHisInfo() {
        return "나이가 " + age + "살인 '" + name + "'씨는 " + isHeMarried(married) + "이며, " + kids + "명의 자식이 있습니다.";
    }
}
