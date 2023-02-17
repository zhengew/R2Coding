package com.rtc.method.param;

import java.util.ArrayList;

/*
    需求：
如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
* */
public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 31};

        System.out.println(arrIsEquals(arr1, arr2));
    }

    // 判断两个数组是都相同
    public static boolean arrIsEquals(int[] arr1, int[] arr2){
        boolean res = false;
        if (arr1.length == arr2.length){
            res = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    res = false;
                    break;  // 遍历数组，如果元素值
                }
            }

        }
        return res;
    }
}

