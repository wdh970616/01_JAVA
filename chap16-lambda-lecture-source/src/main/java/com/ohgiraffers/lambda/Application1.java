package com.ohgiraffers.lambda;

import org.w3c.dom.DOMStringList;

import java.time.LocalTime;
import java.util.*;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {
        Application1 app = new Application1();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    /*
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     */
    private void test1() {
        Consumer<LocalTime> whatTimeIsItNow = time -> System.out.println("현재 시각은 '" + time + "'입니다.");
        whatTimeIsItNow.accept(LocalTime.now());
        System.out.println();
    }

    /*
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     */
    private void test2() {
        Supplier<Integer> getYourLottoNumbers = () -> (int)(Math.random() * 45) + 1;
        int[] lottoNumber = new int[6];
        for (int i = 0; i < lottoNumber.length; i++) {
            for (int j = i + 1; j < lottoNumber.length; j++) {
                lottoNumber[i] = getYourLottoNumbers.get();
                lottoNumber[j] = getYourLottoNumbers.get();
                while (lottoNumber[i] == lottoNumber[j]) {
                    lottoNumber[j] = getYourLottoNumbers.get();
                }
            }
        }
        System.out.print("생성된 로또번호는 [");
        for (int i : lottoNumber) {
            System.out.print(i + " ");
        }
        System.out.println("\b]입니다.");
        System.out.println();
    }

    /*
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     */
    private void test3() {
        Consumer<Integer> wonTodollar = won -> {
            double dollar = won / 1300;
            System.out.println("￦ " + won + "-> $ " + dollar);
        };
        wonTodollar.accept(987654321);
        System.out.println();
    }

    /*
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     */
    private void test4() {
        Function<Integer, String> wonToDollar = won -> {
            return "￦ " + won + "-> $ " + won / 1300.0;
        };
        System.out.println(wonToDollar.apply(1234567890));
        System.out.println();
    }

    /*
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     */
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
        Predicate<String> isNull2 = str -> str.replaceAll(" ","").isEmpty();
        for (String str : strList) {
            System.out.println("공백을 제외한 [" + str + "]의 길이는 0이 " + (isNull2.test(str) ? "맞습니다." : "아닙니다."));
        }
    }
}
