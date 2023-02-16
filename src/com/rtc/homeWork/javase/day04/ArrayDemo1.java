package com.rtc.homeWork.javase.day04;

import java.util.Random;

/*题目1（训练）
  请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：*/
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 1. 定义数组，长度6
        int[] data = new int[6];
        // 2. 遍历并赋值
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(10);
        }

        // 遍历数组
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
