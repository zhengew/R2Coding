package com.rtc.homeWork.javase.day05Method;

import java.util.Scanner;

/*题目3（训练）
通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：

请输入行数：
4
请输入列数：
5
@@@@@
@@@@@
@@@@@
@@@@@
*/
public class MethodTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int row = sc.nextInt();
        System.out.println("请输入列数：");
        int column = sc.nextInt();
        printPic(row, column);
    }

    public static void printPic(int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
