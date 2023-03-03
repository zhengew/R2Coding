package com.rtc.javasepromax.homework.day01.static_singinstance;

/**
 * 饿汉单例模式
 * 在构造对象前已经创建好对象
 * 构造器私有化
 * 静态成员变量初始化对象
 */
public class SingleInstanceEhan {
    public static SingleInstanceEhan instanceEhan = new SingleInstanceEhan();

    private SingleInstanceEhan(){

    }
}
