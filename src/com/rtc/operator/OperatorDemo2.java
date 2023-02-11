package com.rtc.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 需求：拆分3位数，把个位 十位 百位分别输出
        int data = 589;
        // 1. 个位
        int n1 = data % 10;
        // 2. 十位
        int n2 = data % 100 / 10;
        // 3. 百位
        int n3 = data / 100;

        System.out.println(data + "的个位是：" + n1);
        System.out.println(data + "的十位是：" + n2);
        System.out.println(data + "的百位是：" + n3);
    }
}
