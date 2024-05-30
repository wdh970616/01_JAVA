package com.ohgiraffers.api_practice.member;

import java.util.Date;

public class Member {
    int memberNo;
    String memberName;
    int height;
    int weight;
    int yyyymmdd;
    Date birth = new Date(yyyymmdd);

    public Member(String[] member) {
        this.memberNo = Integer.parseInt(member[0]);
        this.memberName = member[1];
        this.height = Integer.parseInt(member[2]);
        this.weight = Integer.parseInt(member[3]);
        this.yyyymmdd = Integer.parseInt(member[4]);
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = Integer.parseInt(memberNo);
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = Integer.parseInt(height);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = Integer.parseInt(weight);
    }

    public int getYyyymmdd() {
        return yyyymmdd;
    }

    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = Integer.parseInt(yyyymmdd);
    }

    public String information() {
        return "회원번호(" + memberNo + ") " + memberName + " [키:" + height + "cm, 몸무게:" + weight + "kg, 생일:" + birth + "]";
    }
}
