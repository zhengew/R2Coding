package com.rtc.oop.constructor;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.price);

        Car c2 = new Car("宝马X6", 80);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
