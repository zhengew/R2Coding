package com.rtc.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        // 目标：理解强制类型转换
        int a = 20;
//      byte b = a; // java: 不兼容的类型: 从int转换到byte可能会有损失
        byte b = (byte) a;
        System.out.println(b);

        byte c = (byte)20.01;
        System.out.println(c);

        double score = 99.5;
        int it = (int)score;
        System.out.println(it);
    }
}
