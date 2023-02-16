package com.rtc.homeWork.javase.day04;
/*## 题目6（训练）
有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
请输入一个整数数字：
50
生成的新数组是：12 14 23 45 50 66 68 70 77 90*/

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // 原数组
        int[] arrOld = {12,14,23,45,66,68,70,77,90,91};
        // 新数组
        int[] arrNew = new int[arrOld.length + 1];
        for (int i = 0; i < arrOld.length; i++) {
            arrNew[i] = arrOld[i];
        }
        // 录入任意整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入任意整数：");
        arrNew[arrNew.length - 1] = sc.nextInt();

        // 数组排序 冒泡排序
        for (int i = 0; i < arrNew.length - 1; i++) {
            for (int j = 0; j < arrNew.length - i - 1; j++) {
                int temp = arrNew[j + 1];
                if (arrNew[j] > arrNew[j + 1]){
                    arrNew[j + 1] = arrNew[j];
                    arrNew[j] = temp;
                }
            }
        }

        // 打印排序后的数组
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + "\t");
        }

    }
}
