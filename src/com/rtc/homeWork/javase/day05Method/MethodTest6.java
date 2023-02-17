package com.rtc.homeWork.javase.day05Method;

/*
题目6（训练）
数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
* */
public class MethodTest6 {
    public static void main(String[] args) {
        double num = -5.10;
        System.out.println(num + "的绝对值是：" + abs(num));
    }

    public static double abs(double num){
        if (num >= 0){
            return num;
        }else{
            return - num;
        }
    }
}
