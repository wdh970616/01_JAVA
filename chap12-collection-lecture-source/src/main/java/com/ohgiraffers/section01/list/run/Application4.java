package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {
    public static void main(String[] args) {
        /*
         * Queue
         * 선입선출(FIFO - First In First Out)방식의 자료구조
         *
         * Queue 인터페이스를 상속받는 하위 인터페이스들
         * : Deque, BlockingQueue, TransferQueue 등
         * 대부분의 큐는 LinkedList를 이용한다.
         */
        // Queue는 인터페이스이기 때문에 자체로 인스턴스 생성이 불가능
//        Queue<String> que = new Queue<>();

        Queue<String> que = new LinkedList<>(); // LinkedList를 주로 사용함

        // offer()를 통해 데이터를 넣는다.
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("que = " + que);
        System.out.println();

        /*
         * 큐에서 데이터를 꺼내는 방식
         * peek() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
         * poll() : 해달 큐에 가장 앞에 있는 요소(먼저 들어온 요소)를 반환 후 제거
         */
        System.out.println("que.peek() : " + que.peek());
        System.out.println("que.peek()한 후의 que = " + que);
        System.out.println("que.poll() : " + que.poll());
        System.out.println("que.poll()한 후의 que = " + que);
    }
}
