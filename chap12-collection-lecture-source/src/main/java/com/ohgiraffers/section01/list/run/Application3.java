package com.ohgiraffers.section01.list.run;

import javax.print.attribute.IntegerSyntax;
import java.util.Stack;

public class Application3 {
    public static void main(String[] args) {

        /*
         * Stack
         * 후입선출(LIFO - Last In First Out)방식의 자료구조
         */

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        // add()도 이용가능하지만 Vector의 메소드이다.
        // push()사용이 권장된다.
//        integerStack.add(6);
        System.out.println("integerStack = " + integerStack);
        System.out.println();

        /*
         * 스택에서 요소를 찾을 때 search()를 사용
         * 인덱스가 아닌, 위에서부터의 순번을 의미
         * 가장 상단의 위치가 0이 아니라 1부터 시작.
         */
        System.out.println("integerStack.search(5) = " + integerStack.search(5));
        System.out.println();

        /*
         * 스택에서 값을 꺼내는 메소드
         * 1. peek() : 해당 스택의 가장 마지막에 있는 요소 반환
         * 2. pop() : 해당 스택의 가장 마지막에 있는 요소를 반환 후 제거
         */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println("integerStack을 peek()한 결과 = " + integerStack);
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("integerStack을 pop()한 결과 = " + integerStack);
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
//        System.out.println("pop() : " + integerStack.pop());  // 갯수보다 더 많이 pop 할경우 EmptyStackException 에러발생
        System.out.println("integerStack을 pop()으로 다 꺼낸 결과 = " + integerStack);
    }
}
