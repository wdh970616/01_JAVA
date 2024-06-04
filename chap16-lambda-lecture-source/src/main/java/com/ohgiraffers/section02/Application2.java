package com.ohgiraffers.section02;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {

        // Supplier : 매개변수가 없고 리턴값이 있는 getXXX() 메소드를 가지고있다.

        // Supplier<T>#get() : T : 객체 T를 리턴
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);
        System.out.println();

        // BooleanSupplier#getAsBoolean() : boolean : boolean값을 리턴
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0 ? false : true;
        };
        System.out.println("랜덤 true or false : " + booleanSupplier.getAsBoolean());
        System.out.println();

        // IntSupplier#getAsInt() : int : int값을 리턴
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위에서 " + intSupplier.getAsInt() + "이(가) 나왔군요.");
        System.out.println();

        // DoubleSupplier#getAsDouble() : double : double값을 리턴
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());
        System.out.println();

        // LongSupplier#getAsLong() : long : long값을 리턴한다.
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난시간 : " + longSupplier.getAsLong());
    }
}
