package com.rtc.javasepromax.day01.d6_extends;

import java.util.Scanner;

/**
 * 老师类：子类
 */
public class Teacher extends People {
    private String dept; // 部门

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void showQuestion(){
        System.out.println(getName() + "发布问题~~");
    }
}
