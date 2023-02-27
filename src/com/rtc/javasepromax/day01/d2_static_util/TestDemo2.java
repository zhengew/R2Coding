package com.rtc.javasepromax.day01.d2_static_util;

public class TestDemo2 {
    public static void main(String[] args) {
        // 测试工具类
        int[] arr = null;
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};
        System.out.println(ArrayUtil.toString(arr)); // null
        System.out.println(ArrayUtil.toString(arr1)); // []
        System.out.println(ArrayUtil.toString(arr2)); // [1, 2, 3]

        System.out.println(ArrayUtil.getAverage(new double[]{1.0, 10.0, 9.0, 8.0, 3.0}));

    }
}
