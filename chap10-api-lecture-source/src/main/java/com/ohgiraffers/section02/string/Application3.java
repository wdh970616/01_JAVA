package com.ohgiraffers.section02.string;

public class Application3 {
    public static void main(String[] args) {

        // 문자열 분리

        /*
         * split() : 정규표현식을 이용하여 문자열을 분리한다.
         *           비정규화된 문자열을 분리할 때 좋다. (공백 문자열 값 포함)
         *           정규표현식을 이용하기 때문에 속도가 느리다는 단점이 있음
         * StringToTokenizer : 문자열의 모든 문자를 구분자로 하여 문자열을 분리한다.
         *                     정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 문자열 무시)
         *                     split()보다 속도면에서 빠름
         *                     구분자를 생략하는 경우 공백이 구분자임.
         */

        String emp1 = "100,홍길동,서울,영업부"; // 모든값 존재
        String emp2 = "200,유관순, ,총무부";  // 주소값 없음
        String emp3 = "300,이순신,경기도,";   // 부서 없음

        String[] empArr1 = emp1.split(",");
        String[] empArr2 = emp2.split(",");
        String[] empArr3 = emp3.split(",");
        String[] empArr4 = emp3.split(",", -1);  // limit 을 -1 로 설정하여 끝까지 출력하게함

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println("emmArr1[ " + i + " ] = " + empArr1[i]);
        }
        System.out.println();

        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("emmArr2[ " + i + " ] = " + empArr2[i]);
        }
        System.out.println();

        for (int i = 0; i < empArr3.length; i++) {
            System.out.println("emmArr3[ " + i + " ] = " + empArr3[i]);
        }   // 마지막열이 출력 안됨
        System.out.println();

        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("emmArr4[ " + i + " ] = " + empArr4[i]);
        }   // limit 을 -1 로 설정하여 끝까지 출력하게함
    }
}
