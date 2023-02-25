package com.rtc.oopReview;

public class TestCar {
    public static void main(String[] args) {
        // 目标：复习this的作用
        Car c = new Car("布加迪威龙", 20000000);

        System.out.println(c.getName());
        System.out.println(c.getPrice());

        c.goWith("奥拓");
    }
}
