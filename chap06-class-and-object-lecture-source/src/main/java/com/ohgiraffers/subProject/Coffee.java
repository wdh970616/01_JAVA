package com.ohgiraffers.subProject;

public class Coffee {

    private static int coffeeBeans = (int) (Math.random() * 101 + 100);
    private String menuName;
    private String option;
    private int count;

    public Coffee(String menuName, String option, int count) {
        this.menuName = menuName;
        this.option = option;
        this.count = count;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String thisIsYourOrder() {
        return menuName + "[" + option + "] " + count + "잔";
    }

    public static int CoffeeBeans() {
        return Coffee.coffeeBeans;
    }
}
