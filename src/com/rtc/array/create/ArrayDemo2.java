package com.rtc.array.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标：学会访问数组的元素
        int[] ages = {12, 24, 36};
        //            0    1   2
        // 取值： 数组名[索引]
        System.out.println(ages[0]);
        System.out.println(ages[1]); // 24
        System.out.println(ages[2]);

        // 赋值： 数据类型[索引] = 数值;
        ages[2] = 100;
        System.out.println(ages[2]); // 100

        // 访问数组的长度
        System.out.println(ages.length);  // 3
    }
}
