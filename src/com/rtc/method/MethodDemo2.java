package com.rtc.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 学习方法的完整定义格式，并理解其调用和执行流程
        // 方法调用
        int sum = add(10, 20);
        System.out.println(sum);
    }

    // 完整定义方法
    public static int add(int a, int b){
        return a + b;
    }
}
