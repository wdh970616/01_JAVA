package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Max";
        dog.age = 5;
        dog.breed = "골든 리트리버";
        System.out.println("이 강아지의 이름은 '" + dog.name + "'이고 나이는 " + dog.age + "살이며 " + dog.breed + "입니다.");
        System.out.println();

        Book book = new Book();
        book.writer = "Joshua Bloch";
        book.title = "Effective Java";
        book.cover = "하드커버";
        book.page = 416;
        System.out.println("'"+ book.writer + "'가 쓴 책 '" + book.title + "'는 " + book.cover + "이며, 총 " + book.page + "페이지이다.");
        System.out.println();

        Car car = new Car();
        car.name = "Tesla Model S";
        car.since = 2022;
        car.electric = "전기차";
        System.out.println(car.name + "은 " + car.since + "년식이며 " + car.electric + "이다.");
        System.out.println();

        Man man = new Man();
        man.age = 30;
        man.name = "James";
        man.married = true;
        man.kids = 3;
        System.out.println("나이가 " + man.age + "살인 '" + man.name +"'씨는 " +(man.married? "유부남" : "미혼남")+ "이며, " + man.kids + "명의 자식이 있습니다.");
        System.out.println();

        Laptop laptop = new Laptop();
        laptop.brand = "Dell";
        laptop.model = "XPS 13";
        laptop.ram = 16;
        laptop.ssd = 512;
        System.out.println(laptop.brand + "사의 랩탑인 '" + laptop.model + "'은(는) " + laptop.ram + "GB RAM과 " + laptop.ssd + "GB SSD가 탑재되어있다.");
    }
}
