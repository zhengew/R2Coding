package com.rtc.javasepromax.day1_static;

public class Student {
    /**
     * 实例成员变量，无static修饰，属于对象
     */
    private String name;

    /**
     * 静态成员方法,有static修饰，归属于类，可以被共享访问，用对象名或类名都可以访问
     */
    public static int getMax(int age1, int age2){
        return age1 > age2 ? age1 : age2;
    }

    /**
     * 实例成员方法:属于对象，只能用对象触发访问
     */
    public void study(){
        System.out.println(name + "在好好学习，天天向上");
    }


    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        // 1.类名.静态成员方法
        System.out.println(Student.getMax(10, 3));
        // 注意：同一个类中访问静态方法，类名可以省略不写
        System.out.println(getMax(10, 20));

        // study(); // Non-static method 'study()' cannot be referenced from a static context
        // 2.对象.实例方法
        Student stu = new Student();
        stu.name = "孙悟空";
        stu.study();

        // 3.对象.静态方法(语法可行，但不推荐)
        System.out.println(stu.getMax(10, 20));
    }
}
