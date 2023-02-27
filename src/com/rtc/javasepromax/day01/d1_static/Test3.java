package com.rtc.javasepromax.day01.d1_static;

public class Test3 {

    /**
     * 静态成员
     */
    public static int onlineNumber = 0;
    public static void test2(){
        System.out.println("==静态方法test2==");
    }


    /**
     * 实例成员
     */
    private String name;
    public void run(){
        System.out.println(name + "跑的快～～～");
    }


    // 1.静态方法只能访问静态成员，不能直接访问实例成员
    public static void test(){
        System.out.println(Test3.onlineNumber);
        test2();
        Test3.test2();
        // System.out.println(name); // 不能直接访问实例成员 Non-static field 'name' cannot be referenced from a static context
       // run(); // 不能直接访问实例成员 Non-static method 'run()' cannot be referenced from a static context
    }

    // 2.实例方法可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(Test3.onlineNumber);
        test2();
        Test3.test2();
        System.out.println(name);
        run();
        System.out.println(this.name); // this可以出现在实例方法中,实例方法是由对象调用的，this指代的是当前对象的内存地址
        System.out.println(this);
    }

    // 3.静态方法中不可以出现this关键字
    public static void test3(){
        // this 只能代表当前对象！！
        // System.out.println(this); // 'com.rtc.javasepromax.day1_static.Test3.this' cannot be referenced from a static context
    }

    public static void main(String[] args) {
        // 目标：理解static 访问相关的语法，面试笔试题，或者以后理解程序很重要的知识(拓展)

    }
}
