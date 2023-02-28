package com.rtc.javasepromax.day01.d6_extends;

import java.util.Scanner;

/**
 * 老师类：子类
 */
public class Teacher extends People {
    private String dept; // 部门

    public Teacher(){}
    public Teacher(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String showQuestion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请发布问题：");
        String question = sc.next();
        return question;
    }
}
