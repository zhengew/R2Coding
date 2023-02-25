package com.rtc.javasepromax.day1_static;

public class User {
    /**
     * 在线人数
     * 注意：static修饰的成员变量：静态成员变量，在内存中只有一份，可以被共享
     */
    public static int onlineNumber = 161;

    /**
     * 实例成员变量：无static修饰，属于每个对象的，必须用对象名.访问
     */
    private String name;
    private int age;

    public static void main(String[] args) {
        // 目标：理解static修饰的作用和访问特点
        // 1.类名.静态成员变量
        System.out.println(User.onlineNumber);

        // 2.对象名.实例成员变量
//        System.out.println(User.name);
        User u = new User();
        u.name = "张三";
        u.age = 21;
        u.onlineNumber++; // 新来了一个人

        User u2 = new User();
        u2.name = "李四";
        u2.age = 21;
        u2.onlineNumber++; // 新来了一个人

        System.out.println(u.onlineNumber);
        System.out.println(User.onlineNumber); // 推荐方式
        // 同一个类中，静态成员变量的访问可以省略类名
        System.out.println(onlineNumber);
    }
}
