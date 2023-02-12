package com.rtc.loop;

public class ForTest3 {
    public static void main(String[] args) {
        // 需求：求1-10之间的奇数和，并把求和结果在控制台输出

        // 方式1
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if ( i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("1-10之间的奇数和: " + sum);

        System.out.println();
        // 方式2
        int sum2 = 0;
        for (int i = 1; i <= 10; i += 2){
            sum2 += i;
        }
        System.out.println("1-10之间的奇数和: " + sum2);

        System.out.println();
        // 需求：求1-10之间的偶数和，并把求和结果在控制台输出
        int sum3 = 0;
        for (int i =2; i <= 10; i += 2){
            sum3 += i;
        }
        System.out.println("1-10之间的偶数和: " + sum3);
    }
}
