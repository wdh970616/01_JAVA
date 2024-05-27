package com.ohgiraffers.subProject2;

public class Coffee {
    // 커피종류
    private final String coffeeName;
    // 옵션
    private final String option;

    public Coffee(String coffeeName, String option) {
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    // toString : 필드에 있는 모든걸 출력하고 싶을때 만드는 메소드
    public String toString() {
        return "%s[%s]".formatted(coffeeName, option);
    }
}
