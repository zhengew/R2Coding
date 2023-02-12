package com.rtc.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Java提供的随机数类 java.util.Random 类
        // 1.导包
        // 2.创建随机数对象
        Random r = new Random();
        // 3.跳用nextInt方法，可以返回一个整型的随机数，前闭后开
        for (int i = 0; i < 20; i++) {
            int data = r.nextInt(10);
            System.out.print(data + "\t");
        }

        System.out.println("-----------------");
        // 打印 1 ～ 10
        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(10) + 1;
            System.out.print(data + "\t");
        }

        System.out.println("-----------------");
        // 3 - 17
        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(15) + 3;
            System.out.print(data + "\t");

        }
    }
}
