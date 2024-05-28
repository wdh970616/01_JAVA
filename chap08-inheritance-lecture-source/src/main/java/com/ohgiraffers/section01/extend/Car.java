package com.ohgiraffers.section01.extend;

// 부모 클래스
public class Car {

    // 자동차의 달리는 상태를 확인할 수 있는 필드
    private boolean runningStatus;


    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }

    // 자동차 달리기
    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다...");
    }

    // 자동차 경적
    public void soundHorn() {
        // 자동차가 주행중일때만 경적을 울리게
        System.out.println(isRunning() ? "빵~빵~빵!" : "주행중인 상태가 아닌 경우 경적을 울릴수 없습니다.");
    }

    // protected -> 같은 패키지 내에서 자유롭게 사용가능 + 자식도 자유롭게 사용가능
    protected boolean isRunning() {
        return runningStatus;
    }

    // 자동차 멈추기
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다...");
    }
}
