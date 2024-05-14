package com.ohgiraffers.section5.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 데이터 형변환
         *
         * 데이터 형변환이 필요한 이유
         * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
         * - 같은 데이터 타입끼리만 연산을 수행할 수 있다.
         */

        /*
         * 형변환의 종류와 규칙
         * 1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
         *  1-1. 작은 자료형에서 큰 자료형으로는 자동형변환이 된다.
         *  1-2. 정수는 실수로 자동형변환된다.
         *  1-3. 문자형은 int형으로 자동형변환된다.
         *  1-4. 논리형은 형변환 규칙에서 제외된다.
         * 2. 강제형변환 (명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 타입 변환
         *  2-1. 자동형변환이 적용되지 않는 경우에 필요하다.
         */

        /* 자동형변환 규칙 테스트 */
        /* 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 */

        byte bnum = 1;
        short snum = bnum;  // 자동형변환
        System.out.println("snum = " + snum);
        int inum = snum;
        System.out.println("inum = " + inum);
        long lnum = inum;
        System.out.println("lnum = " + lnum);

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다. */
        int num1 = 10;
        long num2 = 20;

        //int result1 = num1 + num2;
        // 자동으로 큰 자료형인 long으로 변경해서 연산이 되기 때문에 int로 선언된 변수에 값을 담을수 없다.

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        /* 실수끼리의 자동형변환 */
        float fnum = 4.0f;
        double dnum = fnum;

        // float result2 = fnum + dnum;
        double result2 = fnum + dnum;
        System.out.println("result2 = " + result2);

        /*
         * 정수를 실수로 변경할 때, 소수점 자리가 없어도 실수 형태처럼 표현이 가능하다.
         * 이때, 데이터 손실이 없기 때문에 자동형변환이 된다.
         */

        long eight = 8;
        float four = eight;
        System.out.println("four = " + four);

        float result3 = eight + four;
        System.out.println("result3 = " + result3);

        // 문자형은 int 형으로 자동형변환된다.
        char ch1 = 'a';
        int charNumber = ch1;   // 자동형변환됨

        System.out.println("charNumber = " + charNumber);

        /* int로 type이 명시적으로 정해지지 않은 리터럴 형태의 정수는 char 형 변수에 기록 가능하다 */
        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        /* 논리형은 형변환 규칙에서 제외된다. */
        //boolean isTrue = true;
        //byte b = isTrue;
        //short s = isTrue;
        //int i = isTrue;
        //long l = isTrue;
        //char c = isTrue;
        //float f = isTrue;
        //double d = isTrue;
    }
}
