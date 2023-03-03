package com.rtc.javasepromax.homework.day01.static_singinstance;

/**
 * 懒汉单例
 * 需要时才创建对象，如果创建过就不再创建对象
 * 构造器私有化
 * 定义私有的静态成员变量
 * 定义静态成员方法，判断静态成员是否等于null,等于null则不创建
 */
public class SingleinstanceLanHan {
    private static SingleinstanceLanHan instanceLanHan;

    private SingleinstanceLanHan(){}

    public static SingleinstanceLanHan getInstanceLanHan(){
        if (instanceLanHan == null){
            instanceLanHan = new SingleinstanceLanHan();
        }
        return instanceLanHan;
    }
}
