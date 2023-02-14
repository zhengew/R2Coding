package com.rtc.homeWork.javase.day04;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 案例： 数组元素求和
        int[] arr = {1, 2, 3, 4};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
