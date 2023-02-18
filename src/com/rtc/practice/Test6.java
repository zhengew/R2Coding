package com.rtc.practice;

import java.util.Scanner;

/*
需求：
某系统的数字密码：比如1983，采用加密方式进行传输，
规则如下：先得到每位数，然后每位数都加上5,再对10求余，最后将所有数字反转，得到一串新数
*/
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入需要加密的数字个数：");
        int[] data = new int[sc.nextInt()];
        // 录入需要加密的数组
        for (int i = 0; i < data.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数字：");
            data[i] = sc.nextInt();
        }
        // 打印原始数组
        printArray(data);
        System.out.println();
        // 获取加密后的数组并打印
        int[] res = encryptedArray(data);
        printArray(res);
    }

    /*
    *   数组元素加密
    *   加密规则：先得到每位数，然后每位数都加上5,再对10求余，最后将所有数字反转
    */
    public static int[] encryptedArray(int[] arr){
        // 对数组元素加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        // 对数组元素位置翻转并return数组
        return reverseArray(arr);
    }

    /* 数组元素位置翻转*/
    public static int[] reverseArray(int[] arr){
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) { // for 循环条件可以有多个
            // 元素交换
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /* 打印数组 */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.print("]");
    }
}
