package com.ohgiraffers.section04.use2;

public class FileSaveProvider implements SaveProvider {

    @Override
    public boolean save(String data) {
        System.out.println("[" + data + "] 내용을 Database에 저장 실패했습니다.");
        return false;
    }
}
