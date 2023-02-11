package com.rtc.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        // 目标：学会使用逻辑运算符，并能后选择合适的逻辑运算符解决问题
        double size = 9.8;
        double storage = 6;

        // 需求：尺寸大于等于6.95, 内存大于等于8GB
        // &: 必须前后都是true，结果才是true
        boolean res = size >= 6.95 & storage >= 8;
        System.out.println(res);

        // 需求：要么内存大于等于8， 要么尺寸大于等于6.95
        // |: 只要有一个是true，结果就是true
        res = storage >= 8 | size >= 6.95;
        System.out.println(res);

        // !: 逻辑非
        System.out.println(!false); // true
        System.out.println(!true);  // false

        // ^: 逻辑异或
        System.out.println(false ^ true);  // true
        System.out.println(true ^ false);   // true
        System.out.println(true ^ true);    // false
        System.out.println(false ^ false);  // false

        System.out.println("------&& &， || | 的区别---------");
        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10); // false 短路与， ++b不执行，b的值不变
        System.out.println(b); // 20

        int i = 10;
        int j = 20;
        System.out.println(i > 2 || ++j > 10); // true 短路或， ++j 不执行， j的值不变
        System.out.println(j);


    }
}
