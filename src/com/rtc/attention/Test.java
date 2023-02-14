package com.rtc.attention;

public class Test {
    public static void main(String[] args) {
        // 目标: 数组下标越界异常
        int[] arr = {11, 22, 33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//        System.out.println(arr[3]);
        
        // 空指针异常
        int[] arr2 = null;
        System.out.println(arr2);  // null
        System.out.println(arr2.length);  // Exception in thread "main" java.lang.NullPointerException
        
    }
}
