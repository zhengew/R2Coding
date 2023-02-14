package com.rtc.homeWork.javase.day04;

import java.util.Random;
import java.util.Scanner;

/*需求
        开发一个幸运小游戏，游戏规则如下：
        游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字：
        未猜中提示：“未命中”，并继续猜测
        猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的索引位置，最后把数组中的5个数据都输出看以下， 然后结束本游戏。

        分析
        随机生成5个1-20之间的数据存储起来 ---> 使用数组
        定义一个死循环，输入数据猜测，遍历数组，判断数据是否在数组中，如果在，进行对应提示并结束死循环；如果没有猜中，提示继续猜测直到猜中为止。*/
public class ArrayTest4 {
    public static void main(String[] args) {

        int[] data = new int[5];
        Random r = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1; // 1 ～ 20 之间的随机数赋值给数组
        }

        // 遍历一下数组，方便调试
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();

        // 猜随机数，判断是否再随机数组内，猜中给出数组下标，并打印整个数组元素；未猜中继续猜测
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入幸运数字，范围1~20：");

        OUT:
        while (true){
            int luckNum = sc.nextInt();
            for (int i = 0; i < data.length; i++) {
                if (luckNum == data[i]){
                    System.out.println("猜中了， 给数值在数组的索引位置是: " + i);
                    break OUT;
                }
            }
            System.out.println("未猜中数字，请继续猜猜: ");
        }

        // 猜中后，打印数组元素
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");

        }
    }
}
