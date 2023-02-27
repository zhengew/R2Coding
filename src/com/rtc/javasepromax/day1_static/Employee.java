package com.rtc.javasepromax.day1_static;

/**
 * 练习：定义员工类的实例
 * 需求：请完成一个标准实体类的设计，并提供如下要求实现。
 * ①：某公司的员工信息系统中，需要定义一个公司的员工类Employee，包含如下信息（name, age , 所在部门名称dept ） , 定义一个静态的成员变量company记录公司的名称。
 * ②：需要在Employee类中定义一个方法showInfos()，用于输出当前员工对象的信息。如name, age ，dept 以及公司名称company的信息。
 * ③：需要在Employee类中定义定义一个通用的静态方法compareByAge，用于传输两个员工对象的年龄进入，并返回比较较大的年龄，例如：2个人中的最大年龄是:45岁。
 */
public class Employee {
    private String name; // 员工姓名
    private int age; // 年龄
    private String dept; // 部门
    private static String company = "Google"; // 公司名称

    public Employee() {
    }

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    /**
     * 员工信息
     * 实例成员方法
     */
    public void showInfos(){
        System.out.println("公司名称：" + Employee.company + "\n部门：" + dept + "\n姓名：" + name + "\n年龄：" + age);
    }

    /**
     * 静态成员方法
     *
     */
    public static int compareByAge(int age1, int age2){
        return age1 > age2 ? age1 : age2;
    }


}
