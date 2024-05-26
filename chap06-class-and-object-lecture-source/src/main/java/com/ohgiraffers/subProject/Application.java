package com.ohgiraffers.subProject;

public class Application {
    public static void main(String[] args) {

        // 스토리지 : 재료수 설정 및 보관
        // 바리스타 : 재료수 확인후 커피제조 / 소진안내 / 남은재고 생각 / 음료제공
        // 키오스크 : 접근안내 / 주문받기 / 주문확인 / 주문전달
        // 사용자 : 카페또는집 / 카페입장시바리스타인사 / 주문하기 / 카페퇴장시바리스타인사
        // 어플리케이션 : 실행시 재료수설정, 종료시 뭐할지 구상

        Storage storage = new Storage();
        Barista barista = new Barista();
        Kiosk kiosk = new Kiosk();

        kiosk.kiosk();
    }
}
