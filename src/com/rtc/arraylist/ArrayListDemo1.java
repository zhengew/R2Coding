package com.rtc.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1.创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        // 2.添加数据
        list.add("Java");
        list.add("Java");
        list.add("23");
        list.add("中国");
        list.add(23);
        list.add(0.1);
        System.out.println(list.add('中'));  // true

        System.out.println(list);  // [Java, Java, 23, 中国, 23, 0.1]

        // 3.给指定索引位置插入元素
        list.add(1, "赵敏");
        System.out.println(list);  // [Java, 赵敏, Java, 23, 中国, 23, 0.1, 中]
    }
}
