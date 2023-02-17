package com.rtc.method.param;
<<<<<<< HEAD:src/com/rtc/method/param/Test5.java
import java.util.ArrayList;
=======
>>>>>>> dev:src/com/rtc/method/param/MethodTest5.java

/*
    需求：
如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
* */
public class MethodTest5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println(arrIsEquals(arr1, arr2));
    }

    // 判断两个数组是都相同
    public static boolean arrIsEquals(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}

