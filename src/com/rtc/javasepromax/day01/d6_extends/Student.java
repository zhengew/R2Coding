package com.rtc.javasepromax.day01.d6_extends;

import java.util.Scanner;

/**
 * 学生类：子类
 */
public class Student extends People{
    private String className;

    public String getclassName() {
        return className;
    }

    public void setclassName(String className) {
        this.className = className;
    }

    /**
     * 子类独有的行为
     */
    public void writeInfo(){
        System.out.println(getName() + "写下了学习语法，好哈皮～～");
    }
}
