package com.rtc.homeWork.javase.day04;

import java.util.Random;

/*题目5（训练）
定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。*/
public class ArrayDemo5 {
    public static void main(String[] args) {
        double[] score = new double[5];
        Random r = new Random();

        for (int i = 0; i < score.length; i++) {
            score[i] = r.nextInt(100);
        }

        // 计算平均分
        double avgScore = 0.0;
        double sum = 0.0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        avgScore = sum / score.length;
        System.out.println("平均成绩为：" + avgScore);
    }
}
