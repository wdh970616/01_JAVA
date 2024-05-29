package com.ohgiraffers.api.member;

import java.time.LocalDate;
import java.util.Date;

public class Member {
    int memberNo;
    String memberName;
    int height;
    int weight;
    int yyyymmdd;
    Date birth = new Date(yyyymmdd);

    public Member(int memberNo, String memberName, int height, int weight, int yyyymmdd) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.yyyymmdd = yyyymmdd;
    }

    public String information() {
        return "회원정보 [회원번호 : " + memberNo + ", 회원이름 : " + memberName + ", 키 : " + height + ", 몸무게 : " + weight + ",생일 : " + birth + "]";
    }
}
