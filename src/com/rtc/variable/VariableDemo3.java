package com.rtc.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        // 基本数据类型定义不同变量
        // 1. byte 1个字节 -128～127
        byte number = 98;
        System.out.println(number);
//        byte number2 = 128; // 溢出

        // 2.short 2个字
        short money = 200;
        System.out.println(money);

        // 3. int 4个字节
        int age = 10;
        System.out.println(age);

        // 4. long 8个字节
        long l1 = 10000;
        System.out.println(l1);

        // 整数默认int类型，数字后跟L表示long类型
        long l2 = 9999999999999999L;
        System.out.println(l2);

        // 5.float 单精度 4个字节
        float f1 = 98.5F;
        System.out.println(f1);

        // 6.double 双精度 8个字节
        double b1 = 10.20;
        System.out.println(b1);

        // 7. char 1个字节
        char c1 = 'A';
        System.out.println(c1);

        // 8. boolean
        boolean rs = true;
        boolean rs2 = false;
        System.out.println(rs);
        System.out.println(rs2);

        // 9. String 引用类型
        String name = "zew";
        System.out.println(name);
    }
}
