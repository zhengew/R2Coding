package com.rtc.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 目标： 学会使用赋值运算符：= += -+ *= /= %=
        int a = 10;
        int b = 200;
//        a = a + b;
        a += b; // a = (int)(a + b);
        System.out.println(a);

        byte i = 10;
        byte j = 20;
//        i = i + j; // java: 不兼容的类型: 从int转换到byte可能会有损失
//        i = (byte)(i + j);
        i += j;
        System.out.println(i);

        int m = 10;
        int n = 5;
//        m += n;
        m -= n; // 等价于 m = (int)(m - n)
        System.out.println(m);

    }
}
