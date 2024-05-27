package com.ohgiraffers.subProject;

import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    AddOrder addOrder = new AddOrder();

    public void kiosk() {
        addOrder.addOrder();

    }
}