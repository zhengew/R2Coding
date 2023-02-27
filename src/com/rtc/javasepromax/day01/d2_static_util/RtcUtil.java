package com.rtc.javasepromax.day01.d2_static_util;

import java.util.Random;

/**
 * 工具类
 */
public class RtcUtil {

    /**
     * 注意：由于工具类无需创建对象，所有把其构造器私有化会显得很专业
     */
    private RtcUtil() {
        // 构造器私有化，
    }

    /**
     * 静态方法
     */



    public static String createVerifyCode(int n){
        // 开发一个验证码
        Random r = new Random();
        // 1.定义一个变量记住验证码
        String code = "";
        // 2.定义一个变量记住全部验证码字符
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // 3.定义一个循环生成几个随机索引，拼接成随机验证码
        for (int i = 0; i < n; i++) {
            code += data.charAt(r.nextInt(data.length()));
        }
        return code;
    }

}
