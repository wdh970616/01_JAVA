package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }

    public int countAlpha(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 65 || s.charAt(i) <= 122) {
                    count++;
                }
            }
        return count;
    }
}
