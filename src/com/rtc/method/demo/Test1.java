package com.rtc.method.demo;

public class Test1 {
    public static void main(String[] args) {
//        需求：定义一个方法，方法中计算出 1-n的和并返回。
        int res = sum(10);
        System.out.println("1~10的和：" + res);

        System.out.println("1~100的和：" + sum(100));
    }

    // 求和
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
