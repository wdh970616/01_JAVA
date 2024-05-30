package com.ohgiraffers.section02;

// 인터페이스 상속이 implements 키워드 대신 extends를 사용해야한다.
// public class RabbitFarm<T implements Animal> {   -> 에러
// public class RabbitFarm<T extends Animal> {   -> 정상
public class RabbitFarm<T extends Rabbit> {

    // 현상황에서는 타입이 어떤거로 선택될지 모르지만,
    // Rabbit이나 Rabbit을 상속받는 Bunny, DrunkenBunny의 후손만 가능하다.
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
