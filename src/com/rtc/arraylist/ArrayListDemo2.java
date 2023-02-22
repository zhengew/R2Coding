package com.rtc.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 目标：理解泛型
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList(); // JDK 1.7 开始，泛型后面的类型申明可以不写
        list.add("Java");
        list.add("Mysql");
//        list.add(10);
//        list.add(0.1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
//        list2.add(0.1);
//        list2.add("Java");
    }
}
