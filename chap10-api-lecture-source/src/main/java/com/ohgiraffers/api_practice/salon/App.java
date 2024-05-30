package com.ohgiraffers.api_practice.salon;

import java.util.*;

public class App {
    public static void main(String[] args) {

        String[] firstSplitData = Data.data.split("\n");
        String[] infoData = new String[firstSplitData.length - 1];
        for (int i = 1; i < infoData.length; i++) {
            infoData[i - 1] = firstSplitData[i];
        }

        List<String> headerList = new ArrayList<>(Arrays.asList(firstSplitData[0]));
        List<Map<String, Object>> mapList = new ArrayList<>();

        int count = 0;
        while (count < firstSplitData.length) {
            String[] secondSplitData = new String[firstSplitData.length];
            for (int j = 0; j < infoData.length; j++) {
                secondSplitData = firstSplitData[j].split(",");
            }
            List<String> infoList = new ArrayList<>(Arrays.asList(secondSplitData));
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
