package com.rtc.string;

import java.util.Scanner;

/**
 * 练习题：模拟用户登录功能，最多只给三次机会
 */
public class StringExec7 {
    public static void main(String[] args) {
        boolean res = login();
        System.out.println("是否登录成功：" + res);
    }

    /**
     *
     * @param name
     * @param password
     * @return 是否登录成功 true/false
     */
    private static boolean login(){
        String okName = "test1";
        String okPwd = "123";
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for (int i = 1; i < 4; i++) {
            System.out.println("请输入用户名: ");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            // 判断是否登录成功
            if (name.equals(okName) && pwd.equals(okPwd)){
                flag =  true;
                break;
            }else {
                if (3 - i == 0) {
                    System.out.println("用户被锁定!");
                    break;
                }
                System.out.println("用户名或密码错误，请重新输入！剩余次数: " + (3 - i) + "次");
            }
        }
        return flag;
    }
}
