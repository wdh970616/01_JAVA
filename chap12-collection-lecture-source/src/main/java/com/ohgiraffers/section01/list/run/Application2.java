package com.ohgiraffers.section01.list.run;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        // LinkedList
        /*
         * ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안됨
         *
         * 단일연결리스트
         * : 저장한 요소가 순서를 유지하지않고 저장되지만 이러한 요소들 사이를 링크로 연결하여 구성하며 마치 연결된 리스트 형태인것처럼 만든 자요구조.
         *   요소의 저장과 삭제시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
         *   요소의 저장과 삭제가 번번히 일어나는 경우 ArrayList보다 성능면에서 우수하다.
         *   단일연결리스트는 다음 요소만 링크하기 때문에 이전 요소로 접근이 어렵다.
         *
         * 이중연결리스트
         * : 단일연결리스트는 다음 요소만 링크하는 반면 이중연결리스트는 이전 요소도 링크하여
         *   이전 요소로 접근하기 쉽게 고안된 자료 구조이다.
         */

        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList = " + linkedList);
        System.out.println();

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }
        System.out.println();

        // remove() 삭제
        linkedList.remove(1);
        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // set() 수정
        linkedList.set(0, "pineapple");
        System.out.println("linkedList = " + linkedList);
        System.out.println();

        // isEmpty() 메소드로 List가 비었는지 확인 가능
        System.out.println(linkedList.isEmpty());
        System.out.println();

        // clear() 리스트 내 모든 요소 삭제
        linkedList.clear();
        System.out.println(linkedList.isEmpty());

    }
}
