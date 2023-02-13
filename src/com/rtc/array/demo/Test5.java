package com.rtc.array.demo;

public class Test5 {
    public static void main(String[] args) {
        // 冒泡排序 [5, 2, 3, 1]
        int[] data = {5, 2, 3, 1};

        // 轮次 data.length - 1
        for (int i = 0; i < data.length - 1; i++) {
            int temp = data[0];
            for (int j = 0; j < data.length - i - 1; j++) {
                System.out.println(j);
            }
        }
    }
}
