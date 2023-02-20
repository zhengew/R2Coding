package com.rtc.homeWork.javase.day06_oop;

public class Goods {
    // 成员变量
    private  int id;
    private String name;
    private int buyNumber;
    private double price;

    // 构造器
    public Goods() {
    }

    public Goods(int id, String name, int buyNumber, double price) {
        this.id = id;
        this.name = name;
        this.buyNumber = buyNumber;
        this.price = price;
    }

    // 成员变量的 get set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
