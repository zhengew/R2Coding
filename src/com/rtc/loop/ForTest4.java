package com.rtc.loop;

public class ForTest4 {
    public static void main(String[] args) {
        // 需求：在控制台输出所有的“水仙花数”，水仙花数必须满足如下2个要求：
        // 水仙花数是一个三位数
        // 水仙花数的个位、十位、百位的数字立方和等于原数（个十百位的立方和 = 数字本身）
        // 打印水仙花数的个数

        int count = 0; // 统计水仙花数的个数

        for (int i = 100; i < 1000; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            int temp = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (temp == i) {
                System.out.print(i + "\t");
                count ++;
            }
        }

        System.out.println(); // 换行
        System.out.println("水仙花数的个数: " + count);



    }
}
