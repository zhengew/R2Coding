package com.rtc.oopReview;

public class Car {
    private String name;
    private double price;

    public Car() {
    }

    public Car(String name, double price){
        // this代表了当前对象
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void goWith(String name){
        // 谁在调用这个方法啊，this就代表谁
        System.out.println(this.name + "正在和" + name + "比赛~");
    }
}
