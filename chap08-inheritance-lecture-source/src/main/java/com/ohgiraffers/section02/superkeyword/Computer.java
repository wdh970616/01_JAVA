package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    // Computer는 하나의 상품이지만, 모든 Product는 Computer가 아니다.

    private String cpu; // cpu
    private int hdd;    // 하드디스크 용량
    private int ram;    // 램 용량
    private String operationSystem; // 운영체제

    // 기본생성자
    public Computer() {
//      super();
        System.out.println("Computer 클래스의 기본생성자 호출함...");
    }

    // Computer만의 필드를 초기화하는 생성자
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    // 부모필드도 같이 초기화하는 생성자
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    //    @Override
//    public String getInformation() {
//        // 부모클래스의 필드까지 출력하는걸 직접 다 명시하면 엄청 길어짐
//        return  "Computer [code = " + super.getCode() + ", brand = " + super.getBrand() + ", name = " + super.getName() + ", price = " + super.getPrice() + ", manufacturingDate = " + super.getManufacturingDate() + ", cpu = " + cpu + ", hdd = " + hdd + ", ram = " + ram + ", operationSystem = " + operationSystem + "]";
//    }

    /*
     * super.getInformation() : 정상적으로 부모의 메소드를 호출
     * this.getInformation() : 재귀호출이 일어나면 stackOverFlow 발생
     * getInformation() : this. 가 자동으로 추가되어 재귀호출 일어남
     * -> 부모 클래스에 있는 메소드를 사용하고 싶다면 super. 를 명시해주어야한다.
     */
    @Override
    public String getInformation() {
        return super.getInformation() + "\nComputer [cpu = " + cpu + ", hdd = " + hdd + ", ram = " + ram + ", operationSystem = " + operationSystem + "]";
    }
}
