package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        // 다른 클래스에서 작성한 메소드 호출

        int first = 100;
        int second = 50;

        /*
         * non-static 메소드의 사용방법
         * 사용준비 (인스턴스)
         * [클래스명] [사용할 이름] = new [클래스명]();
         *
         * 사용
         * [사용할 이름].[메소드명]();
         */

        Calculator calc = new Calculator(); // 인스턴스
        int min = calc.nonStaticMinNumberOf(first, second);
        System.out.println("두 수 중 최소값은 : " + min);

        /*
        * static 메소드의 사용방법
        *
        * 사용준비가 별도로 필요하지 않음. (인스턴스 불필요)
        * [클래스명].[메소드명]();
         */

        int max = Calculator.staticMaxNumberOf(first, second);
        System.out.println("두 수 중 최대값은 : " + max);

//        int max2 = calc.staticMaxNumberOf(first, second);
//        System.out.println("두 수 중 최대값은 : " + max2);
//        스태틱 메소드에서는 권장되지 않는 사용법
    }
}
