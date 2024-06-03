package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        CharCheckException ce = new CharCheckException();
        CharacterProcess cp = new CharacterProcess();
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String s = sc.nextLine();
        cp.countAlpha(s);
        try {
            ce.checkBlackSpace(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
