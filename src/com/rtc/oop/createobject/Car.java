package com.rtc.oop.createobject;

public class Car {
    // 属性 （成员变量）
    String name;
    double price;

    // 方法 (成员方法)
    public void start(){
        System.out.println(name + ",价格是:" + price + "，启动了~~~~");
    }

    public void run(){
        System.out.println(name + ",价格是:" + price + "，跑的很快~~~~");
    }
}
