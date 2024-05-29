package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        String firstS = s.substring(0, 1);
        String remainS = s.substring(1);
        String upperS = firstS.toUpperCase();
        s = upperS.concat(remainS);
        return s;
    }

    public int charSu(String s, char ch) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch ) {
                num++;
            }
        }
        return num;
    }
}