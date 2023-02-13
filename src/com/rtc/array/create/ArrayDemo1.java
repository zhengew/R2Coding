package com.rtc.array.create;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标: 学会使用静态初始化的方式定义数组
        // 格式： 数据类型[] 数组名 = new 数据类型[]{元素1, 元素2....};
        double[] scores = new double[]{99.5, 88, 75.5};

        int[] ages = new int[]{12, 24, 36};

        String[] names = new String[]{"张三", "里斯", "王武"};

        // 简化写法
        double[] scores2 = {99.5, 88, 75.5};

        int[] ages2 = {12, 24, 36};

        String[] names2 = {"张三", "里斯", "王武"};

        System.out.println(scores); // [D@7dc36524  == > [ -> 数组 , D -> double, @xxx -> 内存地址

    }
}
