package com.rtc.method;
/*
    目标：能够说出使用方法的优点
    1. 可以提高代码的复用性和开发效率
    2. 让程序的逻辑更清晰
*/

public class MethodDemo1 {

    // 求和的方法
    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        // 调用 add 方法
        int sum = add(10, 50);
        System.out.println(sum);
    }
}
