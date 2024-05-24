package com.ohgiraffers.section4.DTO;

public class Application {
    public static void main(String[] args) {

        // 생성자를 이용한 초기화 vs 설정자를 이용한 초기화

        /*
         * 1. 생성자를 이용한 초기화
         *  장점 : setter메소드를 여러번 호출해서 사용하지 않고, 단 한번의 호출로 인스턴스 생성 및 초기화 가능
         *  단점 : 필드를 초기화 할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야한다.
         *       호출시 인수가 많아지는 경우에 어떠한 값이 어떤 필드를 의미하는지 한 눈에 보기 힘들다.
         *       예) 아이디, 비밀번호, 이름이 모두 'ohgiraffers' 인 경우
         *       new User("ohgiraffers", "ohgiraffers", "ohgiraffers");
         *
         * 2. 설정자를 이용한 초기화
         *  장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확히 볼 수 있다.
         *       예) 아이디, 비밀번호, 이름이 모두 'ohgiraffers' 인 경우
         *       User user - new User();
         *       user.setId("ohgiraffers");
         *       user.setPwd("ohgiraffers");
         *       user.setName("ohgiraffers");
         *       호출하는 코드만 봐도 어떤 값이 어떤 필드를 초기화하는 내용인지 쉽게 알 수 있다.
         *  단점 : 하나의 인스턴스를 생성할 때, 하나의 호출로 끝나지 않는다.
         *       -> 호출 도중에 컴퓨터가 종료되거나 하면 문제가 발생함.
         */

        // 1. 생성자를 이용한 초기화
        UserDTO user1 = new UserDTO("ohgiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());
        System.out.println(user1.getInfo());

        // 2. 설정자를 이용한 초기화
        UserDTO user2 = new UserDTO();
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());
        System.out.println(user2.getInfo());
    }
}
