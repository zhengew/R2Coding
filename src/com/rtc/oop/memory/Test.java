package com.rtc.oop.memory;

import com.rtc.oop.memory.Student;

public class Test {
    public static void main(String[] args) {
        // 目标：理解两个变量指向同一个对象
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "抽烟、喝酒、汤头";
        s1.study();
        System.out.println(s1);

        // 关键点：把s1变量赋值给学生类型的变量s2
        Student s2 = s1;
        System.out.println(s2);

        s2.hobby = "睡觉、游戏、上课";
        System.out.println(s2.name);
        System.out.println(s1.hobby);
        System.out.println(s2.sex);
        s2.study();
    }
}
