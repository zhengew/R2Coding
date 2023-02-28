package com.rtc.javasepromax.day01.d6_extends;

public class Test {

    public static void main(String[] args) {
        // 目标：理解继承的设计思想
        Teacher t = new Teacher();
        t.showCourse();
        t.showQuestion();

        Student s = new Student();
        s.showCourse();
        s.writeFeedback();
    }
}
