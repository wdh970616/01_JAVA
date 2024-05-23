package com.ohgiraffers.section3.abstraction;

public class Car {
    private boolean isOn;
    private int speed;

    public void turnOn() {
        if (isOn) {
            System.out.println("이미 시동이 걸려있어요!");
        } else {
            isOn = true;
            System.out.println("정상적으로 시동을 걸었어요.\n한번 달려보자구요!");
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("(차가 움직이기 시작했습니다.)");
            this.speed += 10;
            System.out.println("(현재 시속은 " + this.speed + "km/h 입니다.)");
        } else {
            System.out.println("시동이 걸려있지 않아 출발할 수 없어요!\n먼저 시동을 걸어볼까요?.");
        }
    }

    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("(브레이크를 밟았습니다. 차를 멈춥니다.)\n아쉽군요, 더 달리고 싶은데!");
            } else {
                System.out.println("차는 이미 멈춰있다구요!");
            }
        } else {
            System.out.println("시동도 안걸려있다구요!");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (this.speed > 0) {
                System.out.println("달리는 도중엔 시동을 끌수없어요!\n일단 브레이크를 밟아 차를 멈춰볼까요?");
            } else {
                isOn = false;
                System.out.println("무사히 시동을 껐어요.\n아쉽다면 다시 시동을 걸어볼까요?");
            }
        } else {
            System.out.println("시동이 이미 꺼져있는 상태라구요!");
        }
    }
}
