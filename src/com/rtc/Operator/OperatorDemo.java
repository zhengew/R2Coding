package com.rtc.Operator;

public class OperatorDemo {
    public static void main(String[] args) {
        // 目标：掌握基本的算数运算符 + - * / %
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 3.3333 ==> 3 精度损失
        System.out.println(a % b); // 1

        System.out.println(a * 1.0 / b);
    }
}
