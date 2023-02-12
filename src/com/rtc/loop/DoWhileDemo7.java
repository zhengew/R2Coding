package com.rtc.loop;

public class DoWhileDemo7 {
    public static void main(String[] args) {
        // 目标：学会使用 do while 循环，并理解其执行流程
        int i = 0;
        do {
            System.out.println("HelloWorld");
            i++;
        }while (i < 3);

        System.out.println("------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("HelloWorld");
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("HelloWorld");
        }

        System.out.println("-----------------");
        int n = 0;
        while (n < 3){
            System.out.println("HelloWorld");
            n++;
        }
        System.out.println(n); // n = 3
    }
}
