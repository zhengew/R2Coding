package com.rtc.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        // 目标：运算符优先级问题
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // 短路与的优先级高于短路或   true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3); // () 的优先级最高        false
    }
}
