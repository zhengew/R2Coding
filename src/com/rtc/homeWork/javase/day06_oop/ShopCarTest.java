package com.rtc.homeWork.javase.day06_oop;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        // 1.创建一个保存商品类对象的数组
        Goods[] shopCars = new Goods[100]; //假设有100件商品
        // 2.询问用户操作

        while (true) {
            printFunc();
            // 3.根据用户选择操作调用相应功能
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "1":
                    addGood(shopCars);
                    break;
                case "2":
                    queryGood(shopCars);
                    break;
                case "3":
                    updateGood(shopCars);
                    break;
                case "4":
                    System.out.println("payGood");
                    break;
                default:
                    System.out.println("输入错误，请输入 1~4 之间的数字进行功能选择!");
            }
        }
    }

    private static void payGood(Goods[] shopCars) {
    }

    private static void updateGood(Goods[] shopCars) {
    }

    private static void queryGood(Goods[] shopCars) {
    }

    private static void addGood(Goods[] shopCars) {
    }

    private static void printFunc(){
        String[] func = {"add", "query", "update", "pay"}; // 当前可提供的功能
        System.out.println("请选择需要进行的操作: ");
        for (int i = 0; i < func.length; i++) {
            System.out.println((i + 1) + ": " + func[i]);
        }
    }
}
