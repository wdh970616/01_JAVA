package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        /* LinkedHashSet
         *
         * LinkedHashSet 클래스
         * HashSet이 가지는 기능을 모두 가지고 있고 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
         */

        LinkedHashSet<String> lHSet = new LinkedHashSet<>();
        lHSet.add("java");
        lHSet.add("oracle");
        lHSet.add("jdbc");
        lHSet.add("html");
        lHSet.add("css");
        System.out.println("lHSet = " + lHSet);

        // 오름차순
        // TreeSet으로 객체를 생성하면 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬한다. (사전식)
        TreeSet<String> tSet = new TreeSet<>(lHSet);
        System.out.println("tSet = " + tSet);
    }
}
