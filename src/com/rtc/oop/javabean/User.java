package com.rtc.oop.javabean;

public class User {
    // 1.成员变量需要私有化 private修饰
    private String name;
    private double height;
    private int age;
    private char sex;

    // 3.无参数构造器是默认的
    public User() {
    }

    public User(String name, double height, int age, char sex) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.sex = sex;
    }

    // 2.需要提供setter getter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
