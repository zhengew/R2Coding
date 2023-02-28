package com.rtc.javasepromax.day01.d4_static_singleInstance;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握懒汉单例的设计，理解其思想
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2); // true
    }
}
