package com.ohgiraffers.section04.use2;

public class DatabaseSaveProvider implements SaveProvider {

    @Override
    public boolean save(String data) {
        System.out.println("Database에 저장을 성공했습니다.");
        return true;
    }
}
