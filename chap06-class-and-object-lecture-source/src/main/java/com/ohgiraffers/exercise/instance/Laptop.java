package com.ohgiraffers.exercise.instance;

public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int ssd;

    public void laptopBrand(String brand) {
        this.brand = brand;
    }

    public void laptopModel(String model) {
        this.model = model;
    }

    public void laptopRam(int ram) {
        this.ram = ram;
    }

    public void laptopSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getLaptopInfo() {
        return brand + "사의 랩탑인 '" + model + "'은(는) " + ram + "GB RAM과 " + ssd + "GB SSD가 탑재되어있다.";
    }
}
