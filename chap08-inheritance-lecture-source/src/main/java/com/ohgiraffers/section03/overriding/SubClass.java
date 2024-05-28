package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    // 1. 메소드 이름을 변경하면 에러 발생
//    @Override
//    public void method2(int num) {}

    // 2. 메소드의 리턴타입을 변경하면 에러 발생
//    @Override
//    public int method(int num) {
//        return num;
//    }

    // 3. 매개변수의 갯수나 타입이 변경되면 에러 발생
//    @Override
//    public void method(String name) {}

//    @Override
//    public void method(int num, int num2) {}

    // 4. 메소드 이름, 리턴타입, 매개변수 갯수, 매개변수 타입 확인
    @Override
    public void method(int num) {
    }

    // 5. private 메소드는 오버라이딩 불가
//    @Override
//    private void privateMethod() {}

    // 6. final 메소드는 오버라이딩 불가 -> 변경이 불가하기 때문
//    @Override
//    public final void finalMethod() {}

    // 7. 부모메소드의 접근제한자가 같거나 더 넓은 범위로 오버라이딩 가능
//    @Override
//    void protectedMethod() {}   // 더 좁은 범위로는 불가능

//    @Override
//    protected void protectedMethod() {} // 같은 범위로는 가능

    @Override
    public void protectedMethod() {
    }    // 더 넓은 범위로는 가능

    // 클래스에서도 final 키워드를 추가할 수 있는데,
    // 이는 상속을 제한하는 키워드이다.
}
