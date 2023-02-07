package com.rtc.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标：理解变量使用的注意事项
//        - 变量要先声明再使用
        int a = 23;
        System.out.println(a);
//        - 变量声明后，不能再存储其他类型的数据
//        a = 1.5; // java: 不兼容的类型: 从double转换到int可能会有损失

//        - 变量的有效范围是从定义开始到 "}" 截止，且在同一个范围内部不能定义2个同名变量
        {
            int b = 25;
            System.out.println(b);
            System.out.println(a);
//            int b = 100; // 报错 java: 已在方法 main(java.lang.String[])中定义了变量 b
        }
//        System.out.println(b); // java: 找不到符号
        System.out.println(a);
//        int a = 10; // java: 已在方法 main(java.lang.String[])中定义了变量 a
        a = 100; // 这里不是定义变量，在给变量赋值

//        - 变量定义的时候可以没有初始值， 但是使用的时候必须有初始值
        int c;
//        System.out.println(c); // java: 可能尚未初始化变量c Variable 'c' might not have been initialized
        c = 12;
        System.out.println(c);

        char ch = 'a';
        System.out.println(ch + 1); // 98
        System.out.println(ch);
        System.out.println(ch + "");

        int i1 = 0B01100001; // 二进制 97
        System.out.println(i1);
        int i2 = 0141; // 八进制 97
        System.out.println(i2);
        int i3 = 0x61; // 十六进制 97
        System.out.println(i3);
    }
}
