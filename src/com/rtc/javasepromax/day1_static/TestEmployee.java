package com.rtc.javasepromax.day1_static;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三", 18, "开发一部");
        Employee e2 = new Employee("李四", 19, "开发一部");

        e1.showInfos();
        e2.showInfos();

        System.out.println(Employee.compareByAge(e1.getAge(), e2.getAge()));
    }


}
