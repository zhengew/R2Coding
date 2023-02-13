package com.rtc.array.demo;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
/*      需求
        某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
        请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。*/

        // 动态初始化数组，长度5
        int[] codes = new int[5];

        // 录入工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个工号: ");
            codes[i] = sc.nextInt();
        }

        // 遍历当前数组
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }

        System.out.println();

        // 生成 0 ～ codes.length 随机下标，并完成交换
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            // 生成随机下标 交换数据
            int index = r.nextInt(codes.length);
            int temp = codes[index]; // 临时变量保存被交换的数据
            codes[index] = codes[i];
            codes[i] = temp;
        }

        // 遍历交换后的数组
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }

        System.out.println();

    }
}
