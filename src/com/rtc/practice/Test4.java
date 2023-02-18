package com.rtc.practice;

/*
需求：
把一个数组中的元素复制到另一个新数组中去。
分析：
需要动态初始化一个数组，长度与原数组一样。
遍历原数组的每个元素，依次赋值给新数组。
输出两个数组的内容。

* */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] copyArray = copyArray(arr); // 复制数组

        System.out.println("原数组");
        printArray(arr);
        System.out.println();
        System.out.println("复制的数组");
        printArray(copyArray);

        // 数组索引位置,判断索引是否相同
        System.out.println();
        System.out.println(arr == copyArray);
        System.out.println(arr);
        System.out.println(copyArray);
    }

    // 打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.print("]");
    }

    /*
    * 数组复制
    */
    public static int[] copyArray(int[] arr){
        int[] data = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        return data;
    }
}
