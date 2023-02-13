package com.rtc.array.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*开发一个幸运小游戏，游戏规则如下：
        游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字：
        未猜中提示：“未命中”，并继续猜测
        猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的索引位置，最后把数组中的5个数据都输出看以下， 然后结束本游戏。*/

        int[] randomNum = new int[5];

        Random ran = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = ran.nextInt(20) + 1;
        }

        System.out.println(randomNum[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字: ");
        OUT:
        while (true){

            int guess = sc.nextInt();

            for (int i = 0; i < randomNum.length; i++) {
                if (guess == randomNum[i]){
                    System.out.println("运气不错，猜中了，您猜中数字的索引位置是: " + i);
                    for (int i1 = 0; i1 < randomNum.length; i1++) {
                        System.out.print(randomNum[i1] + "\t");
                    }
                    break OUT;
                }
            }
            System.out.println("当前猜测数据在数组中不存在，请重新猜测: ");
        }
    }
}
