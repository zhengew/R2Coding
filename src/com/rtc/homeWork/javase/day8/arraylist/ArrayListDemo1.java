package com.rtc.homeWork.javase.day8.arraylist;

import java.util.ArrayList;

/**
 * 案例：遍历并删除元素
 * 考试成绩 98, 77, 66, 89, 79,50, 100
 * 把成绩低于80的去掉
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1. 定义 ArrayList 集合保存成绩
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);

        // 2. 遍历集合并过滤元素
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score< 80){
                System.out.println(score);
                scores.remove(i);
                i--;  // 删除元素后，集合长度-1, 所以i的位置要 -1,继续判断当前索引位置的元素是否小于80
            }
        }

        // 3.输出过滤后的成绩
        System.out.println(scores);
    }
}
