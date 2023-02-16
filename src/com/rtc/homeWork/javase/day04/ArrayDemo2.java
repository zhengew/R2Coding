package com.rtc.homeWork.javase.day04;
/*
## 题目2（训练）
现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
* */
public class ArrayDemo2 {
    public static void main(String[] args) {
        double[] data = {12.9, 53.54, 75.0, 99.1, 3.14};
        // 定义最小值初始值，并遍历数组依次比较，如果比min小就交换数据
        double min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min){
                min = data[i];
            }
        }
        System.out.println("数组中的最小值为：" + min);
    }
}
