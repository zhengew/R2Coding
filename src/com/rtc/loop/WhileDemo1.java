package com.rtc.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        // 目标： 学会使用while循环,并理解它的流程

        int i = 0; // 循环计数器
        while (i < 3){
            System.out.println("HelloWorld");
            i++;
        }

        System.out.println("----------------");
        int j = 0; // 循环计数器
        while (j < 3){
            System.out.println("HelloWorld");
//            j++; // 死循环
        }
    }
}
