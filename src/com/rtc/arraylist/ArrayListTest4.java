package com.rtc.arraylist;

import java.util.ArrayList;

/**
 * 需求：遍历并删除元素值
 * 某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100
 * 现在需要先把成绩低于80分以下的数据去掉。
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        // 目标：学习遍历并删除元素的正确方式
        // 1. 创建一个ArrayList集合存储一个班级学生的成绩
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

        // 2.把低于80分的成绩从集合中去掉
        // 方案一
//        for (int i = 0; i < scores.size(); i++) {
//            if (scores.get(i) < 80){
//                scores.remove(scores.get(i));
//                i--;  // 删除成功后，必须退一步，这样可以保证回到这个位置，如此则不会跳过数据
//            }
//        }
//        System.out.println(scores);

        // 方案二：从后面倒着遍历再删除就可以
        // [98, 77, 66, 89, 79, 50, 100]
        for (int i = scores.size() - 1; i >= 0; i--) {
            if (scores.get(i) < 80){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
