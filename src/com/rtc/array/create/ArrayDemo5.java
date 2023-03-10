package com.rtc.array.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目标：掌握动态初始化数组的元素默认值
        // 1. 整型数组的元素默认值都是 0 ; ==> byte short int long
        int[] arr = new int[10];
        System.out.println(arr[0]); // 0
        System.out.println(arr[9]); // 0

        // 2.字符数组的元素默认值 也是 0
        char[] chars = new char[100];
        System.out.println(chars[0]); //  
        System.out.println((int)chars[99]); // 0

        // 3.浮点型数组元素默认值 0.0
        double[] scores = new double[90];
        System.out.println(scores[0]);  // 0.0
        System.out.println(scores[89]);

        // 4.布尔型数组元素默认值 false
        boolean[] bool = new boolean[100];
        System.out.println(bool[0]); // false
        System.out.println(bool[99]);

        // 5.引用类型数组元素默认值 null
        String[] names = new String[90];
        System.out.println(names[0]); // null
        System.out.println(names[89]);
    }
}
