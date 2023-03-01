package com.rtc.javasepromax.day01.d8_extends_field_method;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承后成员的访问特点：就近原则
        Dog d = new Dog();
        d.run(); // 子类的
        d.lockDoor(); // 子类的
        // d.go();
        d.showName();
    }
}


class Animal {
    public String name = "动物名";

    public void run(){
        System.out.println("动物可以跑～");
    }
}

class Dog extends Animal{

    public String name = "狗名";

    public void lockDoor(){
        System.out.println("狗可以看门～～");
    }

    public void run(){
        System.out.println("狗跑的贼拉快～～");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name); // 当前子类对象的name
        System.out.println(super.name); // 父类的name

        run(); // 子类的run
        super.run(); // 父类的run
    }
}
