package com.rtc.homeWork.javase.day04;

/*题目8（综合）
定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）*/

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 14,12, 5, 8, 7, 9, 2, 4, 6, 10};
        int[] arrRes = new int[arr.length];

        // 奇数放左边，偶数放右边，每次遇到偶数，奇数的位置要减去对应位置
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arrRes[i-index] = arr[i];
            }else {
                arrRes[arrRes.length - index - 1] = arr[i];
                index++;
            }
        }

        // 遍历数组
        for (int i = 0; i < arrRes.length; i++) {
            System.out.print(arrRes[i] + "\t");
        }
    }
}
