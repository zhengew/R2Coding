package com.rtc.method.demo;

public class Test2 {
    public static void main(String[] args) {
        // 需求：拿一个整数，然后调用方法，把整数交给方法，在方法中输出该数为奇数还是偶数
        int num = 12;
        System.out.println(num + "是奇数还是偶数：" + oddOrEvenNumber(num));
    }

    public static String oddOrEvenNumber(int num){
        String res = "";
        if (num % 2 == 0){
            res = "偶数";
        }else{
            res = "奇数";
        }
        return res;
    }
}
