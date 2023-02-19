package com.rtc.oop.constructor;

public class Car {
    String name;
    double price;

    public Car(){
        System.out.println("无参数构造器被触发执行");
    }

    public Car(String n, double p){
        name = n;
        price = p;
        System.out.println("有参数构造器被触发执行");
    }
}
