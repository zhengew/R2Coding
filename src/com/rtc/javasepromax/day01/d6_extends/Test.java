package com.rtc.javasepromax.day01.d6_extends;

public class Test {

    public static void main(String[] args) {
        // 目标：理解继承的设计思想
        Student s = new Student();
        s.setName("张三"); // 调用父类的
        s.setAge(18); // 调用父类的
        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.showCourse(); // 父类的
        s.writeInfo(); // 子类的方法
    }
}
