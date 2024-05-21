package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 얕은 복사의 활용
         *
         * 얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우
         * 리턴값을 동일한 배열로 리턴해주고 싶은 경우
         */

        String[] names = {"홍길동", "유관순", "이순신"};

        // names배열의 hashcode 출력
        System.out.println("names배열의 hashCode : " + names.hashCode());
        print(names);

        System.out.println();

        String[] animals = getAnimals();
        System.out.println("리턴받은 animals의 hashcode : " + animals.hashCode());
        print(animals);
    }

    // 메소드 호출시 인자로 사용하는 경우의 예시
    public static void print(String[] sarr) {   // sarr에서 얕은 복사 이루어짐
        System.out.println("얕은 복사한 배열의 hashCode : " + sarr.hashCode());
        System.out.print("해당 배열 : ");
        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {
        String[] animals = new String[]{"Bear", "Koala", "Gorilla"};

        // 얕은 복사 확인을 위해 hashcode 출력
        System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());
        return animals;
    }
}
