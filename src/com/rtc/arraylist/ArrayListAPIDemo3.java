package com.rtc.arraylist;

import java.util.ArrayList;

public class ArrayListAPIDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mysql");
        list.add("MyBatis");
        list.add("HTML");

//      1.public E get(int index)	返回指定索引处的元素
        String str = list.get(3);
        System.out.println(str);

//      2.public int size()	返回集合中的元素的个数
        System.out.println(list.size()); // 5
        // 元素遍历：
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");  // Java	Java	Mysql	MyBatis	HTML
        }
        System.out.println();

//      3.public E remove(int index)	删除指定索引处的元素，返回被删除的元素
        System.out.println(list);
        String e2 = list.remove(2);
        System.out.println(e2);  // mysql
        System.out.println(list);

//      4.public boolean remove(Object o)	删除指定的元素，返回删除是否成功 true/ false
        System.out.println(list.remove("MyBatis")); // true
        System.out.println(list);

        System.out.println(list.remove("Java")); // true, 有重复元素时，默认删除第一个
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("王宝强");
        list1.add("Java");
        // 只会删除第一次出现的这个元素值，后面的不删除
        System.out.println(list1.remove("Java"));
        System.out.println(list1);  // [王宝强, Java]

//      5.public E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
        String e3 = list1.set(0, "贾乃亮"); // 王宝强
        System.out.println(e3);
        System.out.println(list1);  // [贾乃亮, Java]
    }
}
