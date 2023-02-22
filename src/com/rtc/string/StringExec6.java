package com.rtc.string;

import java.util.Random;

/**
 * 练习题：随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母
 */
public class StringExec6 {
    public static void main(String[] args) {
        // 1.定义可能出现的随机字符信息
        String name = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 2.循环5次，每次生成一个随机索引，提取对应的字符连接起来即可
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(name.length());
            code += name.charAt(index);
        }

        // 3.输出字符串变量即可
        System.out.println(code);
    }
}
