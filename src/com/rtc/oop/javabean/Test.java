package com.rtc.oop.javabean;

public class Test {
    public static void main(String[] args) {
        // 1. 创建对象封装数据: 无参数构造器
        User u1 = new User();
        u1.setName("张三");
        u1.setAge(18);
        u1.setHeight(201);
        u1.setSex('男');

        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getAge());
        System.out.println(u1.getSex());

        // 2.创建对象，封装数据：有参构造器
        User u2 = new User("李四", 182, 33, '男');
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getAge());
        System.out.println(u2.getSex());
    }
}
