package com.rtc.javasepromax.homework.day01.static_singinstance;

public class TestEhan {
    public static void main(String[] args) {
        SingleInstanceEhan ehan = SingleInstanceEhan.instanceEhan;
        SingleInstanceEhan ehan2 = SingleInstanceEhan.instanceEhan;

        System.out.println(ehan); // SingleInstanceEhan@7a81197d
        System.out.println(ehan2); // SingleInstanceEhan@7a81197d

        System.out.println(ehan == ehan2); // true

        // SingleInstanceEhan()' has private access in 'com.rtc.javasepromax.homework.day01.static_singinstance.SingleInstanceEhan
//        SingleInstanceEhan ehan3 = new SingleInstanceEhan();
    }
}
