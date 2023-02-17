package com.rtc.homeWork.javase.day05Method;

/*
题目7（综合）
请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
*/

public class MethodTest7 {
    public static void main(String[] args) {
        double num = 10.00;
        System.out.println(num + "四舍五入的值为：" + getIntegerNum(num));
    }

    public static int getIntegerNum(double num){
        if (num - (int)num >= 0.5){
            return (int)num + 1;
        }else{
            return (int)num;
        }
    }
}
