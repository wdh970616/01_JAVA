package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*
         * TreeSet 클래스
         * TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
         * 이진 검색 트리는 데이터를 추가하거나 제거하는 등 기본 동작 시간이 매우 빠르다.
         * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른점.
         */

        TreeSet<String> tSet = new TreeSet<>();
//        Set<String> tSet = new TreeSet<>();    // 동적 바인딩
        tSet.add("java");
        tSet.add("oracle");
        tSet.add("jdbc");
        tSet.add("html");
        tSet.add("css");
        //자동 오름차순 정렬
        System.out.println("tSet = " + tSet);

        // 목록 만들어서 하나씩 대문자로 변경해서 출력
        System.out.println("=============== Iterator를 이용 ===============");
        Iterator<String> iter = tSet.iterator();
        // hasNext() ; 다음값이 있는지 확인
        // next() ; 다음 값을 가져오기
        while (iter.hasNext()) {
            System.out.println((String) iter.next().toUpperCase());
        }
        System.out.println();
        System.out.println("=============== 배열을 이용 ===============");
        Object[] arr = tSet.toArray();
        for (Object obj : arr) {
            System.out.println(((String) obj).toUpperCase());
        }
    }
}
