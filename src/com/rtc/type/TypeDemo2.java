package com.rtc.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 目标：表达式的自动类型转换
        byte a = 10;
        int b = 20;
        double c = 1.0;

        double rs = a + b + c; // 31.0
        System.out.println(rs);

        double rs2 = a + b - 2.3;
        System.out.println(rs2);

        // 面试题
        byte i = 10;
        byte j = 20;
        int k = i + j; // 在表达式中 byte、short、char 是直接转换成int类型参与运算的
        System.out.println(k);
    }
}
