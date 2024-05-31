package com.ohgiraffers.api_practice.salon;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // 줄바꿈 단위로 나눠줌
        String[] firstSplitData = Data.data.split("\n");

        // 첫째줄을 헤더리스트(키)로 초기화
        List<String> headerList = new ArrayList<>(Arrays.asList(firstSplitData[0]));

        // 줄바꿈 단위로 나눈 두번째 줄부터 infoData라는 스트링배열로 저장
        String[] infoData = new String[firstSplitData.length - 1];
        for (int i = 1; i < infoData.length; i++) {
            infoData[i - 1] = firstSplitData[i];
        }

        String[] firstSlpitInfoData = Arrays.toString(infoData).split("\n");
        String[] secondSplitInfoData = (Arrays.toString(firstSlpitInfoData)).split(",");
        List<String> infoList = new ArrayList<>(Arrays.asList(secondSplitInfoData));

        List<Map<String, Object>> mapList = new ArrayList<>();

        int count = 0;
        while (count < firstSlpitInfoData.length) {
            Map<String, Object> map = new HashMap<>();
            for (int i = 0; i < headerList.size(); i++) {
                map.put(headerList.get(i), infoList.get(i));
            }
            count++;
            mapList.add(map);
        }
        System.out.println(mapList);
    }
}
