package com.rtc.homeWork.javase.day04;

import java.util.Random;

/*题目3 (训练）
创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。*/
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 定义数组
        int[] data = new int[6];
        // 随机赋值
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(100);
            sum += data[i];
        }

        // 遍历数组
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        // 打印sum
        System.out.println("数组元素之和：" + sum);
    }
}
