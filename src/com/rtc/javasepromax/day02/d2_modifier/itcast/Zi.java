package com.rtc.javasepromax.day02.d2_modifier.itcast;

import com.rtc.javasepromax.day02.d2_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();

        Fu f = new Fu();
        f.publicMethod();
    }
}
