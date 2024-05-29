package com.ohgiraffers.api.member;

public class Member {
    int memberNo;
    String memberName;
    int height;
    int weight;

    public Member(int memberNo, String memberName, int height, int weight) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
    }

    public String information() {
        return "회원정보 [번호 : " + memberNo ;
    }
}
