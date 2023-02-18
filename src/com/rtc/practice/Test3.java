package com.rtc.practice;

import java.util.Random;

/**
 *  需求：
 * 定义方法实现随机产生一个指定位数的验证码，每位可能是数字、大写、小写字母
 * 分析：
 * 定义一个方法，生成验证码返回：返回值类型是String，需要形参接收位数。
 * 在方法内部使用for循环依次生成每位随机字符，并连接起来。
 * 把连接好的随机字符作为一组验证码返回。
 * */
public class Test3 {
    public static void main(String[] args) {
        String captcha = getCaptcha(5);
        System.out.println("随机验证码：" + captcha);
    }

    /*
    *  获取指定位数验证码，验证码由数字、大小写字母组成
    *  length: 验证码的位数
    */
    public static String getCaptcha(int n){
        String captcha = ""; // 拼接验证码
        // 2. 定义一个for循环，循环n次，依次生成随机字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // 3. 生成一个随机字符，英文大写，英文小写， 数字 (0, 1, 2)
            int type = r.nextInt(3); // 0 1 2
            switch (type){
                case 0:
                    // 大写字符
                    captcha += (char)(r.nextInt(26) + 65);
                    break;
                case 1:
                    // 小写字符
                    captcha += (char)(r.nextInt(26) + 97);
                    break;
                case 2:
                    // 数字字符
                    captcha += (char)(r.nextInt(10) + 48);
                    break;
            }
        }
        return captcha;
    }
}
