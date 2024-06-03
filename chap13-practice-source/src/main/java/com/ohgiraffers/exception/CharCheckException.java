package com.ohgiraffers.exception;

public class CharCheckException {

    public void checkBlackSpace(String s) throws Exception {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                System.out.println("체크할 문자열 안에 공백을 포함할 수 없습니다.");
            }
        }
    }

}
