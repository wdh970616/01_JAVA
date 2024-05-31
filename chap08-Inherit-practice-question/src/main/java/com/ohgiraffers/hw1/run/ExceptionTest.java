package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.exception.AgeNegativeException;
import com.ohgiraffers.hw1.exception.HeightNegativeException;
import com.ohgiraffers.hw1.exception.SalaryNegativeException;
import com.ohgiraffers.hw1.exception.WeightNegativeException;

public class ExceptionTest {
    public void checkInfo (int age, double height, double weight, int salary) throws Exception {
        if (age < 0) {
            throw new AgeNegativeException("나이는 음수가 될 수 없습니다.");
        }
        if (height < 0) {
            throw new HeightNegativeException("신장은 음수가 될 수 없습니다.");
        }
        if (weight < 0) {
            throw new WeightNegativeException("몸무게는 음수가 될 수 없습니다.");
        }
        if (salary < 0) {
            throw new SalaryNegativeException("급여는 음수가 될 수 없습니다.");
        }
    }
}
