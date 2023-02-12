package com.rtc.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        // 需求：随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏

        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;
        System.out.println(luckNumber);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请猜数字[0~100]: ");
        while (true){
            int guess = sc.nextInt();

            if (guess == luckNumber){
                System.out.println("恭喜你猜对了！");
                break;

            } else if(guess < luckNumber) {
                System.out.println("猜小了，重新猜: ");

            } else if(guess > luckNumber){
                System.out.println("猜大了，重新猜: ");
            }
        }
    }
}
