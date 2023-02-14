package com.rtc.homeWork.javase.day04;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args) {
        // 案例：数组求最大值
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (arr[i] > temp){
                temp = arr[i];
            }
        }

        System.out.println();
        System.out.println("数组最大值是：" + temp);
    }
}
