package com.rtc.javasepromax.day01.d7_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的特点
        // 1.子类不能继承父类的构造器
        // 2.子类是否可以继承父类的私有成员? 我认为是可以继承父类的私有成员的，只是不能直接访问。
        Tiger t = new Tiger();
        // t.eat();
        // 3.子类是否可以继承父类的静态成员？ 我任务不算继承，只是共享的
        System.out.println(t.location);

    }
}

class Animal {
    private void eat(){
        System.out.println("动物要吃东西～");
    }

    public static String location = "长隆动物园";

}

class Tiger extends Animal {

}