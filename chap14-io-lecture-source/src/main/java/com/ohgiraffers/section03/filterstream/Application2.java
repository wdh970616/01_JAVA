package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 형변환 보조스트림
         * 기본(기반) 스트림이 byte 기반 스트림이고, 보조(필터) 스트림이 char 기반 스트림인 경우 사용한다.
         *
         * 표준 스트림
         * 자바에서 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기위한 스트림을 제공한다.
         * System 클래스의 필드 in, out, err가 대상 데이터의 스트림을 의미한다.
         * System.in (InputStream) : 콘솔로부터 데이터를 입력받는다.
         * System.out (PrintStream) : 콘솔로 데이터를 출력한다.
         * System.err (PrintStream) : 콘솔로 데이터를 출력한다.
         *
         *
         * System.in을 InputStreamReader로 변환 (바이트 기반 스트림 -> 문자 기반 스트림)
         * Buffered를 아용한 보조 스트림과 연결
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력 : ");
        try {
            String value = br.readLine();
            System.out.println("value = " + value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("java mysql jdbc");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
