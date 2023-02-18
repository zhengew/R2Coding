package com.rtc.practice;

import java.util.Scanner;

/*
需求 :
在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
*/
public class Test5 {
    public static void main(String[] args) {
        double avgScore = getAvgScore(saveScore(6));
        System.out.println("选手最总得分是：" + avgScore);
    }

    /*
        保存评委打分,
        n：评委数量
    * */
    public static int[] saveScore(int n){
        Scanner sc = new Scanner(System.in);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请第" + (i+1) + "位评委打分：");
            data[i] = sc.nextInt();
        }
        return data;
    }

    /*
        去掉数组中的最高分与最低分,并计算平均费
    */
    public static double getAvgScore(int[] arr){
        int sum = 0; // 计算总分
        int max = arr[0]; // 最高分
        int min = arr[0]; // 最低分
        // 遍历找出总分、最高分、最低分；
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }

        // 返回平均分
        return 1.0 * (sum - max - min) / (arr.length - 2);
    }
}
