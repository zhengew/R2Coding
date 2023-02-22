package com.rtc.string;

import java.util.Scanner;

/**
 *  案例：键盘录入一个手机号，将中间四位号码屏蔽，最终效果为：159****1234
 */
public class StringExec8 {
    public static void main(String[] args) {
        // 1. 键盘录入一个手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String mobile = sc.next();

        // 2.截取字符串再拼接
        String output = mobile.substring(0, 3) + "****" + mobile.substring(7);
        System.out.println(output);
    }
}
