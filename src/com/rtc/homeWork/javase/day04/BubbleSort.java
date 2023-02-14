package com.rtc.homeWork.javase.day04;

/**
 * 冒泡排序
 * */
public class BubbleSort {
    public static void main(String[] args) {
        // 定义待排序的数组
        int[] data = {1111, 31, 6, 5, 71, 8};

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {

                if (data[j] > data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }

        // 打印排序后的数组
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
