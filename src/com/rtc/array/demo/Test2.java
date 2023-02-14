package com.rtc.array.demo;

public class Test2 {
    public static void main(String[] args) {
        // 案例：数组元素求最大值
        int[] yanzi = {15, 9000, 10000, 20000, 9500, -5};
        int max = yanzi[0]; // 建议拿数组的第一个元素当默认值比较，避免使用默认值
        for (int i = 1; i < yanzi.length; i++) {
            if (yanzi[i] > max){
                max = yanzi[i];
            }
        }

        System.out.println("最大值: " + max);

    }
}
