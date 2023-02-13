package com.rtc.array.create;

public class ArrayAttentionDemo3 {
    public static void main(String[] args) {
        // 数组注意事项
        // 1.数据类型[] 数组名称 =》 数据类型 数组名[]
        int[] ages = {12, 10, 30};
        int ages1[] = {12, 10, 30};

        // 2.什么类型的数组，只能存放什么类型的元素
//        String[] names = {"西门吹雪", "独孤求败", 123}; // Required type:String, Provided:int

        // 3.数组一旦定义出来之后，类型和长度就固定了
        int[] ages2 = {12, 10, 30};
        System.out.println(ages2[3]); // Index 3 out of bounds for length 3 数组下标越界
    }
}
