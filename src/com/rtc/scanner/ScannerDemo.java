package com.rtc.scanner;
// 1. 导包操作（并不需要自己写，以后通过工具进行导入更方便）

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 目标：学会使用键盘录入技术
        // 2. 得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        // 3.调用sc对象的功能，等待接收用户输入的数据
        // 这个代码会等待用户输入的数据，知道用户输入完数据并按了回车键就会把数据拿到
        System.out.println("请谁让您的年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是: " + age + "\n");

        System.out.println("请输入您的姓名: ");
        String name = sc.next();
        System.out.println("您的姓名是：" + name);

        char a = 'A';
        System.out.println(a);
        System.out.println(a + 1);
    }
}
