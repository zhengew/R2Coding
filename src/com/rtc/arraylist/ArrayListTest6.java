package com.rtc.arraylist;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生信息系统的数据搜索:
 * 需求
 * 后台程序需要存储如上学生信息并展示，然后要提供按照学号搜索学生信息的功能。
 * 分析
 * 定义Student类，定义ArrayList集合存储如上学生对象信息，并遍历展示出来。
 * 提供一个方法，可以接收ArrayList集合，和要搜索的学号，返回搜索到的学生对象信息，并展示。
 * 使用死循环，让用户可以不停的搜索。
 */
public class ArrayListTest6 {
    public static void main(String[] args) {
        // 1.定义一个学生类，后期用于创建对象封装学生数据
        // 2.定义一个集合对象，用于装学生对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180303", "东方不败", 23, "推拿二班"));
        students.add(new Student("20180304", "西门吹雪", 26, "中药学四班"));
        students.add(new Student("20180305", "梅超风", 26, "神经科二班"));
        // 3.遍历集合中的每个学生对象并展示
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("学生id:" + student.getStudyId() + "，学生姓名：" +
                    student.getName() + ", 年龄：" + student.getAge() + ", 班级:" + student.getClassName());
        }

        // 4.让用户不断的输入学号，可以搜索出该学生对象信息并展示出来(独立成方法)
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入要查询的学生学号：");
            String id = sc.next();
            Student s = getStucentByStudentID(students, id);
            // 判断学号是否存在
            if (s == null) {
                System.out.println("查无此人");
            } else {
                // 找到了学生对象，信息如下
                System.out.println("学生id:" + s.getStudyId() + "，学生姓名：" +
                        s.getName() + ", 年龄：" + s.getAge() + ", 班级:" + s.getClassName());
            }
        }

    }

    /**
     * 根据学号，去集合中查找学生对象并返回
     * @param students
     * @param studyId
     * @return
     */
    public static Student getStucentByStudentID(ArrayList<Student> students, String studyId){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudyId().equals(studyId)){
                return s;
            }
        }
        return null; // 查无此学号
    }
}