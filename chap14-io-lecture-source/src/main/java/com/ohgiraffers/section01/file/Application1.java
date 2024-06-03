package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        // file 클래스
        /*
         * File
         *
         * JDK 1.0부터 지원하는 API로 파일처리를 수행하는 대표적인 클래스
         * 대상 파일에 대한 정보로 인스턴스를 생성하고
         * 파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공해준다.
         */

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");
        try {
            Boolean isCreate = file.createNewFile();
            // createNewFile()
            // 파일 생성 후 성공, 실패 여부를 boolean으로 리턴한다.
            // 최초 실행시 새롭게 파일이 만들어지기 때문에 true 반환,
            // 한번 생성되고난 이후에는 새롭게 파일이 생성되지 않기 때문에 false 반환.
            System.out.println("파일이 생성되었나? : " + isCreate);
            System.out.println("파일의 크기 : " + file.length() + "byte");
            System.out.println("파일의 경로 : " + file.getPath());
            System.out.println("현재 파일의 상위 경로 : " + file.getParent());
            // 절대경로 : 최상위 루트 위치부터의 경로를 나타냄.
            System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
            // 파일을 삭제
            boolean isDelete = file.delete();
            System.out.println("파일이 삭제되었나? : " + isDelete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
