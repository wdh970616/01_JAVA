package com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        /*
         * Date 클래스
         * JDK 1.0부터 날짜를 취급하기 위해 사용되던 클래스
         * -> 생성자를 비롯해 대부분의 메소드가 Deprecated 되어있다.
         *
         * Date는 java.sql.Date와 java.util.Date가 존재한다.
         * 한 클래스에서 두 개의 타입을 전부 사용하게되면 import를 하더라도 사용하는 타입이 어느 패키지에 있는 Date 클래스인지 모호하기 때문에
         * import해도 풀클래스명을 명시해주어야함.
         */

        /*
         * Deprecated란?
         * 향후 버전이 업데이트되면서 사라지게될 기능이니 가급적 사용하지 말라는 의미
         * -> 하위 버전 호환성 때문에 한번에 제거된 것은 아니고, 남겨두었다.
         */

        // 1. 기본생성자 사용하는 방법
        // 기본생성자로 인스턴스를 생성하면 운영체제의 날짜/시간정보를 이용해서 인스턴스를 만들게된다.
        Date today = new Date();
        System.out.println("today = " + today);

        // 2. Date(Long date) 사용하는 방법
        // getTime() : 1970년 1월 1일 0시 0분 0초 이후에 지난시간을 millisecond로 계산해서 long타입으로 반환함
        System.out.println(today.getTime());

        Date time = new Date(today.getTime());
        System.out.println(time);

    }
}
