package com.rtc.homeWork.javase.day05Method;

/*
题目2（训练）
定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
* */

import java.util.Random;

public class MethodTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100);
        int num2 = r.nextInt(100);
        int num3 = r.nextInt(100);
        System.out.println(num1 + "," + num2 + "," + num3 + "中的最大值为：" + getMaxNum(num1, num2, num3));
    }

    // 三元运算符 比较三个数
    public static int getMaxNum(int num1, int num2, int num3){
        return num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
    }
}
