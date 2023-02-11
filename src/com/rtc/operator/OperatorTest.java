package com.rtc.operator;

public class OperatorTest {
    public static void main(String[] args) {
        // 自增自减运算符 面试题
        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--; // 一步一步的算，不是整个表达式执行完之后再自增或自减

        System.out.println(10 + 12 - 4 - 5 + 1 + 12);
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);
    }
}
