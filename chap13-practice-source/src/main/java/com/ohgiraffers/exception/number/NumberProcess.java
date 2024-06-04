package com.ohgiraffers.exception.number;

public class NumberProcess {

    public boolean checkDouble(int a, int b) {
        if (a < 1 || a > 100 || b < 1 || b > 100)
            throw new NumberRangeException("1부터 100 사이의 값이 아닙니다.");
        if (b % a != 0) {
            return true;
        } else {
            return false;
        }
    }
}
