package com.rtc.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：理解自动类型转换
        byte a = 20;
        int b = a; // 发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double ab = age; // 23.0
        System.out.println(ab);

        char ch = 'a';
        int code = ch;
        System.out.println(code);

        double c = 10.001;
        int d = (int)c; // 强制类型转换
        System.out.println(d);
    }
}
