package com.rtc.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标：学会自增自减运算符 ++ --
        int a = 10;
        a++; // a = a + 1;
        System.out.println(a); // 11
        ++a; // 12
        System.out.println(a);

        int b = 10;
        b--; // b = b - 1;
        System.out.println(b);
        --b; // 8
        System.out.println(b);

        System.out.println("----------------------");
        // 在表达式中或不是单独操作的情况 ++ -- 在变量前后的区别
        // ++ -- 在变量前面，先 +1 -1 再使用
        int i = 10;
        int j = ++i; // j = 11; i = 11;
        System.out.println(i);
        System.out.println(j);

        // ++ -- 在变量的后面，先使用再 +1 -1
        int m = 10;
        int n = m++; // n = 10; m = 11;
        System.out.println(m);
        System.out.println(n);
    }
}
