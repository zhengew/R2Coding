package com.rtc.javasepromax.homework.day01.static_singinstance;

public class TestLanHan {
    public static void main(String[] args) {
        SingleinstanceLanHan lanHan1 = SingleinstanceLanHan.getInstanceLanHan();
        SingleinstanceLanHan lanHan2 = SingleinstanceLanHan.getInstanceLanHan();

        System.out.println(lanHan1);
        System.out.println(lanHan2);
        System.out.println(lanHan1 == lanHan2); // true
    }
}
