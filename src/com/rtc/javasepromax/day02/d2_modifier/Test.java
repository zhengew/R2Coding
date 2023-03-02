package com.rtc.javasepromax.day02.d2_modifier;

public class Test {
    public static void main(String[] args) {
        // 目标：讲解权限修饰符的作用范围，
        Fu f = new Fu();

        f.Method();
        f.protectedMethod();
        f.publicMethod();

    }
}
