package com.rtc.homeWork.javase.day04;

import java.util.Random;
import java.util.Scanner;

/*需求
        某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
        请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。*/
public class ArrayTest5 {
    public static void main(String[] args) {
        // 1. 输入员工工号
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位员工的工号: ");
            codes[i] = sc.nextInt();
        }

        // 2.生成5个随机索引并排序
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int temp = codes[i];
            int index = r.nextInt(codes.length);
            codes[i] = codes[index];
            codes[index] = temp;
        }

        // 遍历交换位置后的数组
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
