package com.rtc.homeWork.javase.day04;

import java.util.Random;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 数组遍历
        Random r = new Random();

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        // 数组遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
