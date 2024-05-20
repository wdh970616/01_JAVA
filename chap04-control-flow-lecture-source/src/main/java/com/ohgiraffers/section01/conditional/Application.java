package com.ohgiraffers.section01.conditional;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        A_If aIf = new A_If();
//        aIf.testSimpleIfStatement();    // 단일 if문
//        aIf.testNestedIfStatement();    // 중첩 if문

        B_IfElse bIfElse = new B_IfElse();
//        bIfElse.testsimpleElseStatement();    // 단일 if-else문
//        bIfElse.testNestedIfElseStatement();  // 중첩 if-else문

        C_IfElseIf cIfElseIf = new C_IfElseIf();
//        cIfElseIf.testSimpleIfElseIfStatement();
//        cIfElseIf.testNestedIfElseIfStatement();

        D_Switch dSwitch = new D_Switch();
//        dSwitch.testSimpleSwitchStatement();
//        dSwitch.testSwitchVendingMachine();
    }
}
