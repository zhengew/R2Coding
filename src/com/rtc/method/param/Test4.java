package com.rtc.method.param;

/*
需求：
设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中不存在该元素则返回 -1。

* */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        System.out.println(findArrIndex(arr, 3));
    }

    public static int findArrIndex(int[] arr, int num){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                index = i;
                break; // 一旦匹配到就跳出循环
            }
        }
        return index; // 存在则返回索引，不存在则返回-1
    }
}
