package com.ohgiraffers.api.member;

public class Run {
    public static void main(String[] args) {

        String memberStr = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] membersStr = memberStr.split("\\|");
        String[] memberInfo1 = membersStr[0].split(",");
        String[] memberInfo2 = membersStr[1].split(",");
        String[] memberInfo3 = membersStr[2].split(",");

        Member member1 = new Member(memberInfo1);
        Member member2 = new Member(memberInfo2);
        Member member3 = new Member(memberInfo3);

        System.out.println(member1.information());
        System.out.println(member2.information());
        System.out.println(member3.information());
    }
}
