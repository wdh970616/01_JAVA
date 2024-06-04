package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }

    public void test1() {
        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();
        System.out.print("문자열을 입력하세요 : ");
        try{
            String str = sc.nextLine();
            System.out.println(cp.countAlpha(str));
        } catch (CharCheckException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
