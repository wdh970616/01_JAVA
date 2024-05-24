package com.ohgiraffers.exercise.instance;

public class Car {

    private String name;
    private int since;
    private String kinds;

    public void carName(String name) {
        this.name = name;
    }

    public void carSince(int since) {
        this.since = since;
    }

    public void carKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getCarInfo() {
        return name + "은(는) " + since + "년식이며 " + kinds + "이다.";
    }
}
