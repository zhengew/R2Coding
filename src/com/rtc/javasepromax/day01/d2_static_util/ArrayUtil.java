package com.rtc.javasepromax.day01.d2_static_util;

/**
 * 练习：完成数组工具类设计
 * 需求：在实际开发中，经常会遇到一些数组使用的工具类。请按照如下要求编写一个数组的工具类：ArraysUtils
 * 我们知道数组对象直接输出的时候是输出对象的地址的，而项目中很多地方都需要返回数组的内容，
 * 请在ArraysUtils中提供一个工具类方法toString，用于返回整数数组的内容，返回的字符串格式如：[10, 20, 50, 34, 100]（只考虑整数数组，且只考虑一维数组）
 * 经常需要统计平均值，平均值为去掉最低分和最高分后的分值，请提供这样一个工具方法 getAverage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
 * 定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。
 */
public class ArrayUtil {

    // 构造器私有化
    private ArrayUtil(){
    }

    /**
     * 打印数组元素
     * @param array
     * @return
     */
    public static String toString(int[] array){
        // 1.校验数组是否为null
        if (array == null){
            return null;
        }

        String arr = "[";
        for (int i = 0; i < array.length; i++) {
            arr += i != array.length - 1 ? (array[i] + ", ") : array[i];
        }
        arr += "]";
        return arr;
    }

    /**
     * 计算平均分
     * @param score
     * @return
     */
    public static double getAverage(double[] score){
        double max = score[0];
        double min = score[0];
        double sum = score[0];
        double avg = 0;
        for (int i = 0; i < score.length-1; i++) {
            max = score[i + 1] > max ? score[i + 1] : max;
            min = score[i + 1] < min ? score[i + 1] : min;
            sum += score[i+1];
        }

        return 1.0 * (sum - max - min) / score.length;
    }
}
