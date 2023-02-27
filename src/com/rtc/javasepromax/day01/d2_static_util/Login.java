package com.rtc.javasepromax.day01.d2_static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        // 开发一个验证码
        String code = RtcUtil.createVerifyCode(5);
        System.out.println(code);
    }


}
