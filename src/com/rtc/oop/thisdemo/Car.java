package com.rtc.oop.thisdemo;

public class Car {
    String name;
    double price;

    public Car(){

    }

    public Car(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void goWith(String name){
        System.out.println(this);
        System.out.println(this.name + "正在和" + name + "比赛!");
    }
}
