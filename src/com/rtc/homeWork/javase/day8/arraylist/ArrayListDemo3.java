package com.rtc.homeWork.javase.day8.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 案例：学生信息系统的数据搜索
 * 后台存储学生信息：学号、姓名、年龄 、班级
 * 提供按学号搜索学生信息的功能
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        Students stu1 = new Students(0001, "张三", 18, "高三一班");
        Students stu2 = new Students(0002, "李斯", 12, "高三一班");
        Students stu3 = new Students(0003, "王五", 16, "高三二班");

        // 集合添加对象
        ArrayList<Students> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 根据学生ID查询学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生ID： ");
        int id = sc.nextInt();
        getStudentInfo(list, id, sc);
    }

    /**
     * 根据学生ID查询学生信息
     * @param list
     * @param id
     */
    private static void getStudentInfo(ArrayList<Students> list, int id, Scanner sc) {
        Students stu = null;
        ArrayList<Integer> stuId = new ArrayList<>(); // 保存学生对象的id
        while(true) {
            if (id == -1) {
                System.out.println("退出查询");
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                stu = list.get(i);
                stuId.add(stu.getId());
                if (stu.getId() == id){
                    System.out.println("ID:" + stu.getId() + "\nname:" + stu.getName() +
                            "\nage:" + stu.getAge() + "\ngrade:" + stu.getGrade());
                }
            }
            if (stuId.contains(id)){
                System.out.println("请输入学生ID：");
                id = sc.nextInt();
            }else {
                System.out.println("您输入的ID不存在，请重新输入或输入-1退出：");
                id = sc.nextInt();
            }

        }
    }
}
