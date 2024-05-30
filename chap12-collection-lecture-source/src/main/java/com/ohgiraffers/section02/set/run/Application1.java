package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /*
         * Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복되지 않게 하나의 null만 저장)
         */

        /*
         * HashSet 클래스
         * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스이다.
         * Hash -> 해시 알고리즘을 사용해서 검색 속도가 빠르다는 장점이 있다.
         */

        HashSet<String> hSet = new HashSet<>();
//        Set<String> hset = new HashSet<>();
//        Collection hset = new HashSet();

        hSet.add(new String("java"));
        hSet.add("oracle");
        hSet.add("jdbc");
        hSet.add("html");
        hSet.add("css");
        // 저장 순서는 유지되지 않는ㄴ다.
        System.out.println("hSet = " + hSet);

        // 중복을 허용하지 않는다.
        hSet.add("java");
        System.out.println("\"java\"를 또 추가한 hSet = " + hSet);
        System.out.println("저장된 객체 수 = " + hSet.size());
        System.out.println("포함확인 = " + hSet.contains("oracle"));
        System.out.println();

        /*
         * 저장된 객체를 한개씩 꺼내는 기능이 없다.
         * 반복문을 이용해서 연속처리하는 방법
         */

        // 1. toArray()배열로 바꾸고 for문 사용
        Object[] arr = hSet.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }
        System.out.println();

        // 2. iterator()로 목록을 만들어서 연속 처리
        Iterator<String> iter = hSet.iterator();
        System.out.print("Iterator로 목록을 만들어 출력 : ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("\n");

        Boolean isDelete = hSet.remove("oracle");
        System.out.println("\"oracle\"을 지운결과 = " + isDelete);
        System.out.println("hSet = " + hSet);
        hSet.clear();
        System.out.println("hSet을 clear()한 후 isEmpty() 물어보기 : " + hSet.isEmpty());
        System.out.println("hSet을 clear()한 후 = " + hSet);
    }
}
