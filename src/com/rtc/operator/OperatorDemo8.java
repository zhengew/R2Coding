package com.rtc.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        // 目标：学习三元运算符，理解其流程
        double score = 98;
        String res =  score >= 60 ? "考试通过" : "挂科";
        System.out.println(res);

        // 需求：从2个整数中找出较大值
        int a = 10000;
        int b = 2000;
        int max = a > b ? a : b;
        System.out.println(max); // 10000

        // 需求：定义三个整数，找出最大值并打印在控制台
        int num1 = 100;
        int num2 = 50;
        int num3 = 30;
        int temp = num1 > num2 ? num1: num2;
        int maxNum = temp > num3 ? temp : num3;
        System.out.println(num1 + "," + num2 + "," + num3 + " 中的最大值为：" + maxNum);

        System.out.println("---------扩展知识 三元运算符嵌套-----------");
        int maxNum2 = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println(num1 + "," + num2 + "," + num3 + " 中的最大值为：" + maxNum2);

    }
}
