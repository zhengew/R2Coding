package com.rtc.javasepromax.day01.d4_static_singleInstance;

/**
 * 饿汉单例实
 */
public class SingleInstance {

    /**
     * 2.饿汉单例是在获取对象前，对象已经提前准备好了一个。
     * 这个对象只能是一个，所以定义静态成员变量(记住)
     */
    public static SingleInstance instance = new SingleInstance();


    /**
     * 1.必须把构造器私有化
     */
    private SingleInstance(){
    }
}
