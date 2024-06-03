package com.ohgiraffers.exception.charcheck;

import com.ohgiraffers.exception.CharCheckException;

import java.util.Scanner;

public class Run {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String s = sc.nextLine();
        CharCheckException ce = new CharCheckException();
        try {
            ce.checkBlackSpace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
