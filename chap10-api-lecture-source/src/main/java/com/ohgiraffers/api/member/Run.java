package com.ohgiraffers.api.member;

public class Run {
    public static void main(String[] args) {
//        Member member = new Member();

        String memberStr = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] members = memberStr.split("\\|");
        StringBuilder mb1 = new StringBuilder(members[0]);
        StringBuilder mb2 = new StringBuilder(members[1]);
        StringBuilder mb3 = new StringBuilder(members[2]);



    }
}
