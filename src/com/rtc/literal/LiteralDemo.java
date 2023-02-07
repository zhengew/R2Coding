package com.rtc.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 常见数据在程序中的书写格式
        // 1.整数
        System.out.println(123);

        // 2.小数
        System.out.println(141.01);

        // 3.字符 'A'
        System.out.println('A');
        System.out.println(' '); // 空字符
//        System.out.println(''); // java: 空字符文字

        // 特殊的字符： \n 换行， \t tab
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        // 4.字符串
        System.out.println("HelloWorld");
        System.out.println("");
        System.out.println(" ");
        System.out.println("中");

        // 5.布尔值
        System.out.println(true);
        System.out.println(false);
        System.out.println(1 > 2); // false
    }
}
