package com.rtc.oopReview;

public class People {
    // 1.私有化（合理隐藏）
    // private 修饰的东西只能在本类中访问，其他类中不能访问
    private int age;

    // 2.提供公开化的 getter setter方法（合理暴露）
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       this.age = age;
    }


}
