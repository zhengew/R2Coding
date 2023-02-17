package com.rtc.homeWork.javase.day05Method;

import java.util.Scanner;

/*
题目5（训练）
在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10
* */
public class MethodTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意整数：");
        int a = sc.nextInt();
        System.out.println("请输入任意整数：");
        int b = sc.nextInt();
        System.out.println("请输入任意整数：");
        int c = sc.nextInt();

        printMaxNum(a, b, c);
    }

    public static void printMaxNum(int a, int b, int c){
        // 方式一：冒泡排序
       /* int[] arr = {a, b, c};
        // 数组冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 遍历数组
        System.out.print("从大到小的顺序是： ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }*/

        // 方式二：三目运算 找最大、最小
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        int middle = (a + b + c) - (max + min);
        System.out.print("从大到小的顺序是： " + max + "\t" + middle + "\t" + min);
    }
}
