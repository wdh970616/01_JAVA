package com.ohgiraffers.subProject;public class Coffee {

    private String coffeeName;
    private String option;
    private int coffeeCount;

    public Coffee(String coffeeName, String option, int coffeeCount) {
        this.coffeeName = coffeeName;
        this.option = option;
        this.coffeeCount = coffeeCount;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getCoffeeCount() {
        return coffeeCount;
    }

    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount = coffeeCount;
    }

    public String getCoffeeInfo() {
        return coffeeName + "[" + option + "]" + " " + coffeeCount + "잔";
    }
}
