package com.rtc.type;

public class TypeDemo4 {
    public static void main(String[] args) {
        // 目标：自增自减运算符
        // 前++ 先自增再运算；
        // 后++ 先运算再自增；

        int k = 3;
        int p = 5;
        int rs = k++ + ++k + --p - k-- + ++p + 2;
        // k:   3   4   5   4
        // p:   5   4   5
        // rs:  ? = 3 + 5 + 4 - 5 + 5 + 2
        //      14
        System.out.println(k);
        System.out.println(p);
        System.out.println(rs);

    }
}
