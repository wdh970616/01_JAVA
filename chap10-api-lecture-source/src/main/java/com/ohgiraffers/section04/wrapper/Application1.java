package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 기본타입          레퍼클래스
         *  byte             Byte
         *  short            Short
         *  int              Int
         *  long             Long
         *  float            Float
         *  double           Double
         *  char             Char
         *  boolean          Boolean
         */

        /*
         * 박싱(Boxing)과 언박싱(UnBoxing)
         * 박싱(Boxing) : 기본타입에서 래퍼클래스의 인스턴스로 인스턴스화 하는 것
         * 언박싱(UnBoxing) : 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것
         */
        int intValue = 20;
//        Integer boxingNumber1 = new Integer(intValue);  // 생성자로 박싱 (8버젼까지만)
        Integer boxingNumber1 = Integer.valueOf(intValue);  // static 메소드 이용하여 박싱
        int unBoxingNumber1 = boxingNumber1.intValue(); // 언박싱

        /*
         * 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
         * -> 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 자동으로 처리해준다.
         * 이런 자동화된 박싱과 언박싱을 오토박싱, 오토언박싱 이라고 한다.
         */

        Integer boxingNumber2 = intValue;   // 오토 박싱 -> Integer.valueOf() 생략됨
        int unBoxingNumber2 = boxingNumber2;    // 오토 언박싱 -> intValue() 생략됨

        // Wrapper 클래스의 값 비교
        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);  // 박싱
        Integer integerNum2 = Integer.valueOf(20);  // 박싱
        Integer integerNum3 = 20;   // 오토박싱
        Integer integerNum4 = 20;   // 오토박싱

        // 기본타입과 래퍼클래스타입을 == 연산으로 비교
        System.out.println("inum과 박싱된 integerNum1 비교 : " + (inum == integerNum1));
        System.out.println("inum과 오토박싱된 integerNum3 비교 : " + (inum == integerNum3));
        // 오토박싱과 박싱도 == 연산으로 비교 가능
        System.out.println("박싱된 integerNum1과 오토박싱된 integerNum3 비교 : " + (integerNum1 == integerNum3));
        System.out.println();
    }
}
