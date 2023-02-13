package com.rtc.array.traverse;

public class ArrayDemo {
    public static void main(String[] args) {
        // 目标：学会数组元素的遍历
        int[] arr = {12, 24, 12, 48, 98};
        //           0   1   2    3   4

        // 原始遍历方式
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println("--------循话遍历数组----------");
        // 循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 快捷键  数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
