package com.ohgiraffers.exercise.instance;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.dogName("Max");
        dog.dogAge(5);
        dog.dogBreed("골든 리트리버");
        System.out.println(dog.getDogInfo());
        System.out.println();

        Book book = new Book();
        book.bookWriter("Joshua Bloch");
        book.bookTitle("Effective Java");
        book.bookCover("하드");
        book.bookPage(416);
        System.out.println(book.getBookInfo());
        System.out.println();

        Car car = new Car();
        car.carName("Tesla Model S");
        car.carSince(2022);
        car.carKinds("전기차");
        System.out.println(car.getCarInfo());
        System.out.println();

        Man man = new Man();
        man.hisAge(30);
        man.hisName("James");
        man.isHeMarried(true);
        man.howManyKids(3);
        System.out.println(man.getHisInfo());
        System.out.println();

        Laptop laptop = new Laptop();
        laptop.laptopBrand("Dell");
        laptop.laptopModel("XPS 13");
        laptop.laptopRam(16);
        laptop.laptopSsd(512);
        System.out.println(laptop.getLaptopInfo());
    }
}
