package com.rtc.javasepromax.day01.d6_extends;

import java.util.Scanner;

/**
 * 学生类：子类
 */
public class Student extends People{
    private String grade;

    public Student(){}
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String writeFeedback(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请填写听课反馈：");
        String info = sc.next();
        return info;
    }
}
