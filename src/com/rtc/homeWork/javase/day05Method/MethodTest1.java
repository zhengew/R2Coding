package com.rtc.homeWork.javase.day05Method;
/*
题目1（训练）
定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
* */
public class MethodTest1 {
    public static void main(String[] args) {
        System.out.println(getMinNum(10.1, 21.2));
    }

    public static double getMinNum(double n1, double n2){
        return n1 > n2 ? n2 : n1;
    }
}
