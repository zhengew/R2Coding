package com.rtc.array.demo;

public class Test5 {
    public static void main(String[] args) {
        // 1. 定义一个数组，存储数据
        int[] arr = {5, 2, 3, 1, 10};
        
        // 2. 定义一个循环控制循话的轮次
        for (int i = 0; i < arr.length - 1 ; i++) {
            // i == 0  比较3次  j = 0 1 2
            // i == 1  比较2次  j = 0 1
            // i == 2  比较1次  j = 0
            // 3.定义一个循环控制每轮比较的次数，占位
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断j当前位置的元素值，是否大于后一个位置，若较大 则交换
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 遍历排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

