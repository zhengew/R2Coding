package com.rtc.practice;

/**
 *  需求：找出101 ～ 200 之间的素数并输出
 *  素数：除了1和它本身以外，不能被其他正整数整除，就叫素数
 * */
public class Test2 {
    public static void main(String[] args) {
        // 循环 101 ～ 200 之间的数据，并打印素数
        for (int i = 101; i <= 200; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i + "\t");
            }
        }
    }

    /* 判断是否是素数 */
    public static boolean isPrimeNumber(int num){
        // 信号位：标记
        boolean flag = true; //一开始假设当前数据是素数
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
