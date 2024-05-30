package com.ohgiraffers.api_practice.string;

public class StringProcess {

    public String preChar(String str) {
//        String upper = str.substring(0, 1).toUpperCase();
//        String remain = str.substring(1);
//        return upper.concat(remain);
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public int charSu(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) count++;
        }
        return count;
    }
}
