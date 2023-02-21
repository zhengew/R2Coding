package com.rtc.string;

import java.util.Scanner;

public class StringAPIEqualsDemo4 {
    public static void main(String[] args) {
        // 1.正确的登录名和密码
        String okName = "test1";
        String okPassword = "123456";

        // 2.请您输入正确的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登录名:");
        String name = sc.next();
        System.out.println("登录密码:");
        String password = sc.next();

        // 3.判断用户输入的登录名称和密码与正确的内容是否相等
        if (okName.equals(name) && okPassword.equals(password)){  // == 比较的是内存地址， equals比较的内容
            System.out.println("登录成功!");
        }else {
            System.out.println("用户名或密码错误！");
        }

        // 4.忽略大小写比较内容的API，一般用于比较验证码这样的业务逻辑
        String sysCode = "12AdFh";
        String code1 = "12aDfH";
        System.out.println(sysCode.equals(code1)); // false
        System.out.println(sysCode.equalsIgnoreCase(code1)); // true
    }
}
