package com.rtc.homeWork.javase.day06_oop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        // 1.创建一个保存商品类对象的数组
        Goods[] shopCars = new Goods[100]; //假设有100件商品
        // 2.询问用户操作
        OUT:
        while (true) {
            printFunc();
            // 3.根据用户选择操作调用相应功能
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "1":
                    addGood(shopCars, sc);
                    break;
                case "2":
                    queryGood(shopCars);
                    break;
                case "3":
                    updateGood(shopCars, sc);
                    break;
                case "4":
                    payGood(shopCars);
                    break;
                case "-1":
                    System.out.println("退出购物车页面");
                    break OUT;
                default:
                    System.out.println("输入错误，请输入 1~4 之间的数字进行功能选择!");
            }
        }
    }

    /**
     * 结算购物车
     * @param shopCars
     */
    private static void payGood(Goods[] shopCars) {
        double money = 0; // 总金额
        for (int i = 0; i < shopCars.length; i++) {
            Goods g = shopCars[i];
            if (g != null){
                money += g.getPrice() * g.getBuyNumber();
            }
        }
        System.out.println("您购物车中商品的待结算总金额为：" + money + "元");
    }

    /**
     * 修改购物车的商品数量
     * @param shopCars
     */
    private static void updateGood(Goods[] shopCars, Scanner sc) {
        while(true) {
            // 用户输入要修改商品的id
            System.out.println("请输入要修改的商品ID：");
            int id = sc.nextInt();
            Goods g = getGoodsId(shopCars, id);
            // 判断该商品在购物车中是否存在，存在则修改,不存在则给出提示
            if (g != null) {
                System.out.println("请输入商品" + g.getName() + "的最新购买数量：");
                int newBuyNumber = sc.nextInt();
                if (newBuyNumber > 0){
                    g.setBuyNumber(newBuyNumber);
                    System.out.println("修改完毕！");
                }else {
                    System.out.println("商品的最小购买数量为1,请确认是否从购物车中删除该商品(Y/N)：");
                    String deleteYN = sc.next();
                    if (deleteYN.equals("Y")){
                        System.out.println("已从购物车中删除商品：" + g.getName());
                        // 怎么确定数组位置？
                        deleteGoods(shopCars, id);
                        break;
                    }
                }
                queryGood(shopCars);
                break;
            } else {
                System.out.println("商品在购物车中不存在");
            }
        }
    }

    /**
     * 查询已添加到购物车的商品
     * @param shopCars
     */
    private static void queryGood(Goods[] shopCars) {
        System.out.println("购物车中的商品有：");
        System.out.println("ID\t\t名称\t\t\t价格\t\t\t数量\t\t\t");
        for (int i = 0; i < shopCars.length; i++) {
            Goods g = shopCars[i];
            if (g != null){
                System.out.println(g.getId() + "\t\t" + g.getName() + "\t\t\t" + g.getPrice() + "\t\t\t" + g.getBuyNumber());
            }else {
                break;
            }
        }
    }

    /**
     * 商品添加到购物车
     * @param shopCars
     * @param sc
     */
    private static void addGood(Goods[] shopCars, Scanner sc) {
        // 添加商品
        System.out.println("请输入商品ID：");
        int id = sc.nextInt();
        System.out.println("请输入商品名称： ");
        String name = sc.next();
        System.out.println("请输入商品价格： ");
        double price = sc.nextDouble();
        System.out.println("请收入购买数量：");
        int buyNumber = sc.nextInt();

        // 创建商品对象并保存商品属性
        Goods g = new Goods();
        g.setId(id);
        g.setName(name);
        g.setPrice(price);
        g.setBuyNumber(buyNumber);

        // 将商品添加到购物车数组
        for (int i = 0; i < shopCars.length; i++) {
            if (shopCars[i] == null){
                shopCars[i] = g;
                break;
            }
        }
        System.out.println("商品：" + g.getName() + "，已添加到购物车");
        queryGood(shopCars);
    }

    /**
     * 购物车功能列表
     */
    private static void printFunc(){
        String[] func = {"add", "query", "update", "pay"}; // 当前可提供的功能
        System.out.println("请选择需要进行的操作: ");
        for (int i = 0; i < func.length; i++) {
            System.out.println((i + 1) + ": " + func[i]);
        }
    }

    /**
     * 判断要修改的对象在商品数组中是否存在，存在返回对象地址，不存在返回nul
     * @param shopCars
     * @param id
     * @return Goods对象
     */
    private static Goods getGoodsId(Goods[] shopCars, int id){
        for (int i = 0; i < shopCars.length; i++) {
            Goods g = shopCars[i];
            if (g.getId() == id){
                return g;
            }
            return null;  // 找完了全部存在的商品，都没有找到
        }
        return null; // 找完了全部100个商品，都没有匹配到
    }

    /**
     *
     * @param shopCars
     * @param id
     */
    private static void deleteGoods(Goods[] shopCars, int id){
        for (int i = 0; i < shopCars.length; i++) {
            Goods g = shopCars[i];
            if (g.getId() == id){
                shopCars[i] = null;
            }
        }
    }
}
