package com.rtc.javasepromax.day01.d10_extends_constructor;

public class Dog extends Animal {
    public Dog(){
        super(); // 写不写都有，默认找父类的无参数构造器
        System.out.println("子类Dog无参数构造器被执行了");
    }

    public Dog(String name){
//        super(); // 写不写都有，默认找父类的无参数构造器
        System.out.println("子类Dog的有参数构造器被执行了");
    }
}
