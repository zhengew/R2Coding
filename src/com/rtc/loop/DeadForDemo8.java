package com.rtc.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
        // 目标：学会定义死循环
//        for (;;){
//            System.out.println("HelloWorld");
//        }

//        System.out.println(); // Unreachable statement

        // 经典写法
//        while (true){
//            System.out.println("HelloWorld");
//        }


        // do ... while
//        do{
//            System.out.println("HelloWorld");
//        }while (true);

        System.out.println("--------------------");

        //        需求：系统密码是520，请用户不断的输入密码验证，验证不对输出：密码错误，验证成功输出：欢迎进入系统，并停止程序。
        String password = "520";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码: ");

        while (true){
            String pwdInput = sc.next();
            if (pwdInput.equals(password)){
                System.out.println("登录成功,欢迎进入系统");
                break; // 立即结束当前所在循环
            }
            System.out.println("密码错误，请重新输入:");
        }
    }
}
