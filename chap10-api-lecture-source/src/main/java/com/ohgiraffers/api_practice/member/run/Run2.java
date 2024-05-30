package com.ohgiraffers.api_practice.member.run;

import com.ohgiraffers.api_practice.member.Member2;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run2 {
    public static void main(String[] args) {

        String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] firstSplitArr = data.split("\\|");

//        String[] secondSplitArr1 = firstSplitArr[0].split(",");
//        String[] secondSplitArr2 = firstSplitArr[1].split(",");
//        String[] secondSplitArr3 = firstSplitArr[2].split(",");
        Member2[] members = new Member2[firstSplitArr.length];
        for (int i = 0; i < firstSplitArr.length; i++) {
            String[] secondSplitArr = firstSplitArr[i].split(",");
            Member2 member = new Member2();
            member.setMemberNo(Integer.parseInt(secondSplitArr[0]));
            member.setMemberName(secondSplitArr[1]);
            member.setHeight(Integer.parseInt(secondSplitArr[2]));
            member.setWeight(Integer.parseInt(secondSplitArr[3]));
            LocalDate birth = LocalDate.parse(secondSplitArr[4], DateTimeFormatter.ofPattern("yyyyMMdd"));
            member.setBirth(birth);
            members[i] = member;
        }
        System.out.println(Arrays.toString(members));
    }
}
