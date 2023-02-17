package com.rtc.method.param;

/* 案例一
设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
“该数组内容为：[11, 22, 33, 44, 55]”
*/

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArr(arr);
    }

    public static void printArr(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
                str += arr[i] + ", ";
            }else{
                str += arr[i] + "]";
            }
        }
        System.out.println("该数组的内容为：" + str);
    }
}
