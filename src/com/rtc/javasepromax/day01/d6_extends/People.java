package com.rtc.javasepromax.day01.d6_extends;

/**
 * 父类
 */
public class People {
    public String name; // 姓名
    public int age; // 年龄

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 查看课表
     */
    public void showCourse(){
        System.out.println("生化环材");
    }
}
