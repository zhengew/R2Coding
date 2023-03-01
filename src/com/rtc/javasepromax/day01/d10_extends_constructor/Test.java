package com.rtc.javasepromax.day01.d10_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：认识继承后构造器的特点
        // 特点：子类的全部构造器默认会先访问父类的无参构造器再执行自己的
        Dog d1 = new Dog();
        System.out.println(d1);

        System.out.println("----------------");
        Dog d2 = new Dog("金毛");
        System.out.println(d2);
    }
}
