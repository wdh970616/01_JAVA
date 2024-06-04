package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }

    public int countAlpha(String s) {
        int count = 0;
        if (s.indexOf(" ") > -1)
            throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 || s.charAt(i) <= 122) {
                count++;
            }
        }
        return count;
    }
}
