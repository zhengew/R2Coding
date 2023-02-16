package com.rtc.method.demo;

public class Test3 {
    public static void main(String[] args) {
        // 把找出数组的最大值案例，改造成方法，可以支持返回任意整型数组的最大值数据
        int[] arr = {1, 2, 31, 10, 4, 11};
        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
