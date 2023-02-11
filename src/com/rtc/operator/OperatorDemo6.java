package com.rtc.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标：学会使用关系运算符
        int a = 10;
        int b = 10;
        boolean res = a == b;
        System.out.println(res); // true
        System.out.println(a == b); // t
        System.out.println(a != b); // f
        System.out.println(a > b); // f
        System.out.println(a >= b); // t
        System.out.println(a < b); // f
        System.out.println(a <= b); // t

        int i = 10;
        int j = 5;
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i > j);
        System.out.println(i >= j);
        System.out.println(i < j);
        System.out.println(i <= j);

        System.out.println(i = j); // 5  相等判断必须是 == ，如果使用 = 是进行赋值操作；
        System.out.println(i);

    }
}
